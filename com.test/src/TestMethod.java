public class TestMethod {
    TestMethod(){}
    public void hello(){

        System.out.println("hello,git");
    }


    public void testArray(){

        char c[] = new char[26];
        c[0] = 'A';

        //
        for(int i=1;i<26;i++){
            c[i] = (char)(c[i-1] +1);
        }
        /*for(int i=1;i<c.length;i++){
            c[i] = (char)('A' + i); //char + int = int ,强转为char
        }*/


        for (int i=0;i<26;i++){
            System.out.println(c[i]);
        }
    }


    public void testArray2(int arr[]){
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public  void arrayAssign(){//数组传递为引用传递 , 整形传递为值拷贝
        int arr2[] = {3,2,1};
        int num2 = 0;

        int arr1[] = arr2;
        int num1 = num2 ;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n"+num2);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] += 1;
        }
        num1++;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n"+num2);
    }


    public void transfromString(){//字符串与各类型互转
        int num = 100;
        double dou = 100.0;
        char c = 'a';
        String s = "" + num;
        System.out.println(s);
        s = "" + dou;
        System.out.println(s);
        s = "" + c;
        System.out.println(s);
        s = "" + num;
        num = Integer.parseInt(s);
        System.out.println(num);
        s = "" + dou;
        dou = Double.parseDouble(s);
        System.out.println(dou);
        //byte short float等类似
        //
    }

    public int [] bubleSort(int arr[]){//冒泡排序
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public int binarySearch(int []arr,int num){//有序数组的二分查找
        int i = 0,j = arr.length-1;
        while(i <= j){
            if(num > arr[(i+j)/2]){
                i = (i+j)/2 + 1;
            } else if (num < arr[(i+j)/2]) {
                j = (i+j)/2 - 1;
            }else{
                return (i+j)/2;
            }
        }
        return -1;
    }

    public int arrTest3(int [][]arr){
        int sum = 0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public void yangHuiTriAngle(){
        int yangHui[][] = new int[10][];

        /*for (int i = 0;i < 10; i++){
            yangHui[i] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                yangHui[i][j] = 1;
            }
        }

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
            }
        }*/

        for (int i = 0;i < 10; i++){
            yangHui[i] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                if(i < 2||j == 0||j == i){
                    yangHui[i][j] = 1;
                }
                else {
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                }
            }
        }

        for (int i = 0;i < 10; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(yangHui[i][j]+" ");
            }
            System.out.print("\n");
        }
    }


    public int fibonacci(int num){//斐波那契数列

        if (num > 2) {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }else if(num > 0 ){
            return 1;
        }
        return -1;
    }


    public int monkeyEat(int day){

        if (day > 1){
            int num = 2 * (monkeyEat(day-1) + 1);
            System.out.println(num);
            return num;
        } else if (day == 0) {
            return 1;
        }
        return -1;
    }

}
