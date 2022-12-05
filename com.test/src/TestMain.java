import java.util.Random;

public class TestMain {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Random ra = new Random();

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

        t1.arrayAssign();
    }
}
