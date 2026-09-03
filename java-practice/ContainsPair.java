import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ContainsPair {
    public static void main(String[] args) {
        // System.out.println(ContainsPair.containsPair1(List.of(3, 9, 5, 6, 6, 7)));
        // System.out.println(ContainsPair.containsPair2(List.of(3, 9, 5, 6, 6, 7)));
        // System.out.println(ContainsPair.containsPair3(List.of(3, 9, 5, 6, 10, 7)));
        // System.out.println(ContainsPair.containsPair4(List.of(3, 9, 5, 6, 10, 7, 2,
        // 3, 2)));
        // System.out.println(ContainsPair.containsPair5(List.of(3, 9, 5, 6, 10, 7, 2, 3, 2)));
        System.out.println(ContainsPair.containsPair6(List.of(3, 9, 5, 6, 10, 7, 2, 3, 2)));
        System.out.println("New Test: List.of(7,8,8,9,12,4,0), Expected: true");
        System.out.println(ContainsPair.containsPair6(List.of(7,8,8,9,12,4,0)));
    }

    public static boolean containsPair1(List<Integer> l) {
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i).equals(l.get(i + 1))) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsPair2(List<Integer> l) {
        for (int i = 0; i < (l.size() - 1); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsPair3(List<Integer> l) {
        for (int i = 0; i < (l.size() - 1); i++) {
            for (int j = 0; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsPair4(List<Integer> l) {
        List<Integer> unique = new ArrayList<Integer>();
        for (int i = 0; i < l.size(); i++) {
            if (unique.contains(l.get(i))) {
                return true;
            }
            unique.add(l.get(i));
        }
        return false;
    }

    public static boolean containsPair5(List<Integer> l) {
        Map<Integer, Integer> s = new HashMap<Integer, Integer>();
        for (int i = 0; i < l.size(); i++) {
            if (s.containsKey(l.get(i))) {
                return true;
            }
            s.put(l.get(i), 1);
        }
        return false;
    }

    public static boolean containsPair6(List<Integer> l) {
        Set<Integer> s = new HashSet<Integer>(l);
        return s.size() != l.size();
    }

}