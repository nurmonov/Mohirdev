package Collection.ArreyList.topwiriq1;

import java.util.ArrayList;

public class Color {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            color.add(i+1+" rang");

        }
        System.out.println(color);
        color.add(1,"8 rang");
        System.out.println(color);

        color.remove(5);
        System.out.println(color);
    }
}
