public class Test1 {
    Test1(){}
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


}
