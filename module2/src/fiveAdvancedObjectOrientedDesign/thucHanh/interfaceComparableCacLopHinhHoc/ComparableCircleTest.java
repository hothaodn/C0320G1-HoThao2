package fiveAdvancedObjectOrientedDesign.thucHanh.interfaceComparableCacLopHinhHoc;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);
        System.out.println("------"+Arrays.toString(circles));;
        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        if(circles[0].compareTo(circles[2]) == -1){
            System.out.println(circles[0].compareTo(circles[2]));
            System.out.println("c0 larger than c2");
        }else{
            System.out.println("c0 smaller than c2");
        }
    }
}
