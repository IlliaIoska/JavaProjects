import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static int getNthInteger(List<Integer> numbers, Integer element) {
        ListIterator<Integer> i = numbers.listIterator();
        int currentElement = 0;
        try {
            while(i.hasNext()) {
                currentElement = i.next();
                if (currentElement == element) {
                    System.out.println("Element found");
                    return currentElement;
                }
                currentElement = 0;
            }
        } catch (Exception e) {
            System.out.println("ELement NOt found");
            System.out.println(e);
        }

        return currentElement;
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(getNthInteger(numbers, 4));
    }

}