package annotationsproblems.exerciseproblems.supressuncheckedwarnings;

import java.util.ArrayList;

public class SuppressWarning {
    @SuppressWarnings("unchecked")
    public static void suppressWarning() {

        ArrayList rawList = new ArrayList();

        rawList.add("Hello");
        rawList.add(100);
        rawList.add(true);

        System.out.println("First element: " + rawList.get(0));
        System.out.println("Second element: " + rawList.get(1));
        System.out.println("Third element: " + rawList.get(2));
    }
}
