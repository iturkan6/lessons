package month2.lesson3.check_homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseElements {
//    public ArrayList<Integer> reverse(ArrayList<Integer> numbers) {
//        ArrayList<Integer> reverseList = new ArrayList<>();
//        for (int i = numbers.size() - 1; i >= 0; i--) {
//            reverseList.add(numbers.get(i));
//        }
//        return reverseList;
//    }
//
//    public void printElements(ArrayList<Integer> numbers) {
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.print(numbers.get(i) + " ");
//
//        }
//    }
//
//    public static void main(String[] args) {
//        ReverseElements obj = new ReverseElements();
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        System.out.print("Elements before reversing: ");
//        obj.printElements(numbers);
//        numbers = obj.reverse(numbers);
//        System.out.print("\nElements after reversing: ");
//        obj.printElements(numbers);
//
//    }


    public static ArrayList<Integer> reverse(ArrayList<Integer> numbers) {
        ArrayList<Integer> reverseList = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reverseList.add(numbers.get(i));
        }
        return reverseList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.printf("Elements before reversing: %s\n", numbers.toString());
        ArrayList<Integer> reversed_numbers = reverse(numbers);
        System.out.printf("Elements after reversing: %s", reversed_numbers);
    }
}
