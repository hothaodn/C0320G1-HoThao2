package fiveAdvancedObjectOrientedDesign.baiTap.interfaceColorableCacLopHinhHoc;

import fiveAdvancedObjectOrientedDesign.baiTap.classCacLopHinhHoc.*;

public class TestColorable{
    /*Hãy tạo một interface Colorable với một phương thức void có tên howToColor().
    Cho lớp Square triển khai interface này với phương thức howToColor()
    hiển thị thông điệp Color all four sides..
    Tạo một mảng các đối tượng hình học trong đó có ít nhất một Square.
    Với mỗi phần tử trong mảng, hiển thị diện tích của nó, nếu phần tử đó là một Colorable,
    gọi phương thức howToColor().*/
    public static void main(String[] args) {
        Shape[] shapeColor = new Shape[5];
        shapeColor[0] = new Circle(9);
        shapeColor[1] = new Rectangle(5,8);
        shapeColor[2] = new Square(6);
        shapeColor[3] = new Circle(68);
        shapeColor[4] = new Square(11);
        for(int i = 0; i < shapeColor.length; i++){
            if(shapeColor[i] instanceof Square){
                System.out.println("Index " + i);
                ((Square)shapeColor[i]).howToColor();
            }
        }
    }

}
