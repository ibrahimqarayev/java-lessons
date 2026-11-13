import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        task1("Hello world heLLo wORld Java jaVA pRogRAmming JAVA  ");
        System.out.println();
        task2();
    }

    public static void task1(String text) {
        String[] words = text.toLowerCase().split(" ");

        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            if (wordMap.containsKey(word)) {
                Integer count = wordMap.get(word);
                wordMap.put(word, count + 1);
            } else {
                wordMap.put(word, 1);
            }
        }
        System.out.println(wordMap);


        String result = "";
        int max = 0;

        for (String word : wordMap.keySet()) {
            int number = wordMap.get(word);

            if (number > max) {
                max = number;
                result = word;
            }
        }

        System.out.println(result + " : " + max);
    }

    public static void task2() {
        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Ali");
        students.put(102, "Vali");
        students.put(103, "Aysel");
        students.put(104, "Nigar");

        // insert
        students.put(102, "Elvin");

        System.out.println(students);

        // lookup
        Integer key = 103;
        String value = students.get(key);
        System.out.println(key + " : " + value);

        Integer key2 = 999;
        String value2 = students.getOrDefault(key2, "Not Found");
        System.out.println(key2 + " : " + value2);

        // lookup
        Integer key3 = 105;
        boolean hasKey = students.containsKey(key3);
        System.out.println("Does student " + key3 + " exist? " + hasKey);

        // remove
        Integer key4 = 101;
        String value4 = students.remove(key4);
        System.out.println("Removed student: " + value4);

        // wrong key
        Integer key5 = 500;
        String value5 = students.remove(key5);
        System.out.println("non-existing key: " + value5);

        // print
        System.out.println("Size: " + students.size());
        System.out.println("Contents: " + students);
    }
}