import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Task4
        String[] words = {"Hello", "World", "Java"};

        swap(words, 0, 2);

        for (String name : words) {
            System.out.println(name);
        }
        System.out.println();

        //Task5
        List<Integer> numbers = List.of(5, 10, 15);

        System.out.println(sum(numbers));

        System.out.println();

        //Task6
        List<Integer> numberList = new ArrayList<>();

        fillList(numberList, 6);

        System.out.println(numberList);
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number number : list) {
            total = total + number.doubleValue();
        }
        return total;
    }

    public static void fillList(List<? super Integer> list, int n) {
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
    }
}