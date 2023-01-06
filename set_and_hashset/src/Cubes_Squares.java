import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Cubes_Squares {
    public static void main(String[] args) {
        Set<Integer> cubes = new HashSet<>();
        Set<Integer> squares = new HashSet<>();

        for(int i = 1; i <= 100; i++) {
            cubes.add(i * i * i);
            squares.add(i * i);
        }

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
//        Set<Integer> union1 = new HashSet<>();
//        union1.addAll(squares);
//        union1.addAll(cubes);
//        if (union.containsAll(union1)) {
//            System.out.println("Equal");
//        }

        Set<Integer> intersection = new HashSet<>(squares);
        System.out.println(intersection.retainAll(cubes));

        for(int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        String sentence = "Hello Puppy Puppy";
        String[] words = sentence.split(" ");
        Set<String> wordsSet = new HashSet<>();
        wordsSet.addAll(Arrays.asList(words));

        for(String s : wordsSet) {
            System.out.println(s);
        }

        String[] natureWords = new String[]{"all", "nature", "is", "art", "unknown", "to", "thee"};
        String[] divineWords = new String[]{"to", "err", "is", "human", "to", "forgive", "divine"};
        Set<String> natureSet = new HashSet<>();
        natureSet.addAll(Arrays.asList(natureWords));
        Set<String> divineSet = new HashSet<>();
        divineSet.addAll(Arrays.asList(divineWords));

        System.out.println("Nature - Divine = ");
        Set<String> similaritiesInNatureAndDivine = new HashSet<>(natureSet);
        similaritiesInNatureAndDivine.retainAll(divineSet);
        for (String i : similaritiesInNatureAndDivine) {
            System.out.println("Similarity = " + i);
        }
        Set<String> diffirenceInNatureAndDivine = new HashSet<>(natureSet);
//        diffirenceInNatureAndDivine.removeAll(similaritiesInNatureAndDivine);
        diffirenceInNatureAndDivine.removeAll(divineSet);
        for (String i : diffirenceInNatureAndDivine) {
            System.out.println("Difference = " + i);
        }












    }
}
