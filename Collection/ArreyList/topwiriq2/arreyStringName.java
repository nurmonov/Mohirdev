package Collection.ArreyList.topwiriq2;

import java.util.ArrayList;
import java.util.Collections;

public class arreyStringName {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("ali");
        name.add("vali");
        name.add("gani");
        name.add("gani");
        name.add("ali");
        name.add("wermat");
        name.add("towmat");
        int n = 3;
        for (int i = 0; i < name.size(); i++) {
            if (i == n) {
                i++;
                continue;
            }
            if (name.get(3).equals(name.get(i))) {
                System.out.println(true + "\n" + name.get(i));
            }

        }

        // todo c wartdagi bajaradikon metod
        Collections.shuffle(name);
        System.out.println(name);

    }
}
