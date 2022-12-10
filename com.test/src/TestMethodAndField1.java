public class TestMethodAndField1 {

    public void method1(){
        System.out.println("同一类中的属性和方法可以直接被本类中的方法直接调用");
    }

    public void method2(){
        method1();
        Test t = new Test();
        t.method1();
    }

    public void method3(Test t){//参数是类时传递的是具体对象的指针
        t.method1();
    }

}

class Test{

    /*Test(){
        System.out.println("不同类中需要在方法中new一个要调用方法所属类的对象");
    }*/
    boolean flag;

    public void method1(){
        flag = true;
        System.out.println("被调用成功");
    }
}