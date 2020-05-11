public class GopMang {
    public static void main(String[] args){
        int[][] array1 = initializeArr(5,5);
        int[][] array2 = initializeArr(5,5);
        System.out.println(display(array1));
        System.out.println(display(array2));

        
    }
    public static int[][] initializeArr(int row, int column){
        int[][] arr = new int[row][];
        //Scanner input = new Scanner(System.in);
        for( int i = 0; i < row; i++){
            arr[i] = new int[column];
            for( int j = 0; j < column; j++){
                //System.out.println("Index [" +i+"]["+j+"]");
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
