public class Mang2ChieuTinhTongSoCuaDuongCheo {
    public static void main(String[] args){
        //ứng dụng cho phép người dùng nhập vào một ma trận vuông của các số thực,
        // sau đó tính ra cho người dùng tổng của các số ở đường chéo chính.
        float[][] array = initArr(5);
        float lineSize1 = 0;
        float lineSize2 = 0;
        System.out.println(display(array));
        for( int i = 0; i < array.length; i++){
            for( int j = 0; j < array[i].length; j++){
                if( i == j ){
                    lineSize1 += array[i][j];
                }
            }
            lineSize2 += array[array.length-1-i][i];
        }
        System.out.println("First diagonal line \\ has the summary of values is " + lineSize1);
        System.out.println("Second diagonal line / has the summary of values is " + lineSize2);
    }
    public static float[][] initArr(int size){
        float[][] arr = new float[size][];
        //Scanner input = new Scanner(System.in);
        for( int i = 0; i < size; i++){
            arr[i] = new float[size];
            for( int j = 0; j < size; j++){
                arr[i][j] = (float) (Math.floor(Math.random() * 10));
            }
        }
        return arr;
    }
    public static String display(float[][] arr){
        String print = "Array\n";
        for (float[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                print += ints[j] + "\t\t";
            }
            print += "\n";
        }
        return print;
    }
}
