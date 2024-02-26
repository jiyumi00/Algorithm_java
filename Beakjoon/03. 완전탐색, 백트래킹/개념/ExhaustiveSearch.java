import java.util.ArrayList;

public class ExhaustiveSearch {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
        v.add(1);
        v.add(3);
        v.add(2);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);

        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) == 5) {
                System.out.println(i);
                break;
            }
        }

        int i = 0;
        while (i < v.size()) {
            if (v.get(i) == 5) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
