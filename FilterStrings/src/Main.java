import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public List<String> search(List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());

//        Iterator<String> i = list.listIterator();
//
//        while(i.hasNext()) {
//            String s = i.next();
//            String[] substringsOfS = s.split("");
//            if (substringsOfS[0] == "a") {
//                System.out.println(substringsOfS[0]);
//            }
//        }
    }
}