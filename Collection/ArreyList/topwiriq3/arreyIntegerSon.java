package Collection.ArreyList.topwiriq3;

import java.util.ArrayList;
import java.util.Comparator;

public class arreyIntegerSon {
    public static void main(String[] args) {
        ArrayList<Integer> son = new ArrayList<>();
        son.add(1);
        son.add(2);
        son.add(3);
        son.add(4);
        son.add(5);
        son.add(6);
        son.sort(Comparator.reverseOrder());
        System.out.println(son);

    }
}