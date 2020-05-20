public class HienThi100SoNguyenTo {
    public static void main(String[] args){
        // phát triển một ứng dụng cho phép hiển thị các số nguyên tố nhỏ hơn 100.
        long number;
        boolean check = true;
        for ( number = 2; number <= 100 ; number++){
            if( number == 2 ){
                System.out.println(number);
            }else{
                for ( int i = 2; i <= Math.sqrt(number) ; i++){
                    if( number % i == 0 ){
                        check = false;
                        break;
                    }
                }
                if(check == true){
                    System.out.println(number);
                }
                check = true;
            }
        }
    }
}
