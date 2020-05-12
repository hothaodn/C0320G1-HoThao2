import java.util.Arrays;

public class GopMang {
    public static void main(String[] args){
        int[][] array1 = initializeArr(5,6);
        int[][] array2 = initializeArr(3,3);
        System.out.println(display(array1));
        System.out.println(display(array2));
        int[][] array3 = mergeArr(array1, array2);
        System.out.println("Merged: " + display(array3));
    }
    public static int[][] mergeArr(int[][] arr1,int[][] arr2){
        int row = arr1.length + arr2.length;
        int column;
        if(arr1[0].length >= arr2[0].length){
            column = arr1[0].length;
        }else{
            column = arr2[0].length;
        }
        int[][] arr3 = new int[row][column];
        for( int i = 0; i < arr1.length; i++){
            for( int j = 0; j < arr1[0].length; j++){
                arr3[i][j] = arr1[i][j];
            }
        }
        for( int i = 0; i < arr2.length; i++){
            for( int j = 0; j < arr2[0].length; j++){
                arr3[arr1.length+i][j] = arr2[i][j];
            }
        }
        return arr3;
    }
    public static int[][] initializeArr(int row, int column){
        int[][] arr = new int[row][];
        //Scanner input = new Scanner(System.in);
        for( int i = 0; i < row; i++){
            arr[i] = new int[column];
            for( int j = 0; j < column; j++){
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }
    public static String display(int[][] arr){
        String print = "Array\n";
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                print += ints[j] + "\t";
            }
            print += "\n";
        }
        return print;
    }
}
