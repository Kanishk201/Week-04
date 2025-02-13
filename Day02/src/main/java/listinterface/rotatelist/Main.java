package listinterface.rotatelist;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        System.out.println("Rotated List : "+ListRotate.rotateList(list,2));
    }
}