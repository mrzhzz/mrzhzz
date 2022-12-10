import java.util.Random;

public class TestMain {
    public static void main(String[] args) {
        TestMethod t1 = new TestMethod();
        Random ra = new Random();
        TestMethodAndField1 t2 = new TestMethodAndField1();

        /*t1.hello();*/

        /*t1.testArray();*/

        /*int array[] = new int[10];
        for(int i=0;i<array.length;i++){
            array[i] = ra.nextInt(100);
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        t1.testArray2(array);*/

        /*t1.arrayAssign();*/

        /*t1.transfromString();*/

        /*int arr[] = {1,2,5,6,8,9,11};
        int num = 1;
        num = t1.binarySearch(arr,num);
        System.out.println("目标索引sada为"+num);*/

        /*int arr[][] = {{1,2,3},{3,4},{-1,-2,-3}};
        int sum = t1.arrTest3(arr);
        System.out.println(sum);*/

        /*t1.yangHuiTriAngle();*/


        //包装类，暂时没学
        //输出：
        //false
        //true
        //==为比较地址是否相同，不同类地址显然不同，equals则是类中的方法，该类的equals为值的比较
        /*Integer a = new Integer(10);
        Integer b = new Integer(10);
        System.out.println(a == b);
        System.out.println(a.equals(b));*/

        /*TestMethodAndField1 t = new TestMethodAndField1();
        Test tt = new Test();
        System.out.println(tt.flag);
        t.method3(tt);
        System.out.println(tt.flag);*/


    }
}
