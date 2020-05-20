package fiveAdvancedObjectOrientedDesign.thucHanh.interfaceComparatorSoSanhCacLopHinhHoc;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(9.9);
        circles[2] = new Circle(10,"blue",true);

        for(Circle circle: circles){
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("After sorting: ");
        for(Circle circle: circles){
            System.out.println(circle);
        }
    }
}
