package fiveAdvancedObjectOrientedDesign.baiTap.interfaceResizeableLopHinhHoc;

import fiveAdvancedObjectOrientedDesign.baiTap.classCacLopHinhHoc.Circle;
import fiveAdvancedObjectOrientedDesign.baiTap.classCacLopHinhHoc.Shape;
import fiveAdvancedObjectOrientedDesign.baiTap.classCacLopHinhHoc.Square;

public class TestResize {
    /*Hãy tạo một interface Resizeable với một phương thức void có tên resize(double percent).
    Phương thức này tăng kích thước các hình lên tỷ lệ phần trăm được cho bởi đối số đầu vào.
    Cho lớp Circle, Rectangle và Square triển khai phương thức này.
    Viết một chương trình tạo ra một mảng các hình.
    Với mỗi phần tử trong mảng,tăng kích thước phần tử đó lên theo một tỉ lệ ngẫu nhiên từ 1-100.
    Thông báo ra màn hình diện tích của phần tử trước và sau khi tăng kích thước.*/
    public static void main(String[] args) {
        /*Circle circle = new Circle(9);
        System.out.println(circle);
        circle.resize(0.5);
        System.out.println(circle);

        Square square = new Square(10);
        System.out.println(square);
        square.resize(0.5);
        System.out.println(square);*/

        Shape[] arrayShape = new Shape[3];
        arrayShape[0] = new Circle(9);
        arrayShape[1] = new Square(10);

        for( int i = 0; i < arrayShape.length; i++){
            System.out.println("========>> at first: " + arrayShape[i]);
            double percent = (double) Math.random()*1;
            if( arrayShape[i] instanceof Circle){
                ((Circle)arrayShape[i]).resize(percent);
            }else if(arrayShape[i] instanceof Square){
                ((Square)arrayShape[i]).resize(percent);
            }
            System.out.println(">> After resize: " + arrayShape[i]);
        }
    }
}
