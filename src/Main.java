import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("ab", "ab", "bc", "bc", "cd", "cd", "de", "de", "ef", "ef"));

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println("Не четное число " + num);
            }
        }
    }

    public static void task2() {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println("Четное число " + num);
                prevNum = num;
            }
        }
    }

    public static void task3() {
        Set<String> words2 = new HashSet<>(words);
        System.out.println(words2);
    }

    public static void task4() {
        Set<String> words3 = new HashSet<>(words);
        System.out.println(words.size() - words3.size());
    }
}