import java.util.Arrays;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava pJava = new PuzzleJava();

        // Tests:
        int[] oTenTest = {3,5,1,2,7,9,8,13,25,32};
        System.out.println(pJava.sumOverTen(oTenTest));

        String[] randomOFiveTest = {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
        System.out.println(pJava.nameSwapFive(randomOFiveTest));

        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        System.out.println(pJava.alphaShuffle(alpha));

        System.out.println(Arrays.toString(pJava.randTen()));
        pJava.randMaxMinSort();
        System.out.println(pJava.randString());
        System.out.println(Arrays.toString(pJava.randStringArr()));
    }
}