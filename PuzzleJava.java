// Dependencies
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.lang.Character;

public class PuzzleJava {

    // Accepts an array of integers, sums the values and creates a new array of numbers over 10 from the given array.
    public ArrayList<Integer> sumOverTen(int[] x) {
        ArrayList<Integer> overTen = new ArrayList<Integer>();
        int sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
            // if value of index is over 10, append to ArrayList
            if (x[i] > 10) {
                overTen.add(x[i]);
            }
        }

        System.out.println(sum);
        return overTen;
    }

    // Accepts an array of strings, shuffles the values and returns an array with strings over 5 characters
    public ArrayList<String> nameSwapFive(String[] x) {
        // Random to randomize array, new ArrayList for strings > 5 length.
        Random r = new Random();
        ArrayList<String> overFive = new ArrayList<String>();

        // Randomizes the given array
        for (int i = x.length-1; i > 0; i--) {
            // Pick a random number from 0 to i -- this is why you iterate in reverse
            int j = r.nextInt(i);

            // Swap with temp
            String temp = x[i];
            x[i] = x[j];
            x[j] = temp;
        }

        // Print names of each person / add strings with length > 5 to overFive ArrayList
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            if (x[i].length() > 5) {
                overFive.add(x[i]);
            }
        }
        return overFive;
    }

    // Accepts an array of 26 characters. If the Array does not == 26 in length, return a string that says the array is an incorrect length
    // Shuffle the array and display the last character and first character. If the first character in the array is a vowel, display a message
    // that says its a vowel.
    public ArrayList<Character> alphaShuffle(char[] x) {
        // Even handler for 26 characters
        ArrayList<Character> xShuffle = new ArrayList<Character>();
        if (x.length != 26) {
            System.out.println("The array of characters must equal the length of the alphabet (26)!\n");
            return xShuffle;
        } else {
            // Creates list to shuffle
            for (int i = 0; i < x.length; i++) {
                xShuffle.add(x[i]);
            }
            
            // Shuffles list
            Collections.shuffle(xShuffle);
            System.out.println("After shuffling the last character of the given array is: " + xShuffle.get(25) + " and the first character is: " + xShuffle.get(0));
            if (xShuffle.get(0) == 'a' || xShuffle.get(0) == 'e' || xShuffle.get(0) == 'i' || xShuffle.get(0) == 'o' || xShuffle.get(0) == 'u') {
                System.out.println("The first character is a vowel!");
            }

            return xShuffle;
        }
    }

    // Generate and return an array with 10 random numbers between 55-100
    public int[] randTen() {
        Random r = new Random();

        int i = 0;
        int[] arr;
        arr = new int[10];

        // Generates 10 random numbers
        while (i < 10) {
            // Sets params for nextInt
            int low = 55;
            int high = 100;

            // the difference of hgih - low is the cap on the random number. You add low in order to set the floor!
            // This gives a random number between 0-45 and then adds 55 to set the floor at 55 cap the number at 100.
            arr[i] = r.nextInt(high-low) + low;
            i++;
        }

        return arr;
    }

    // Generate an array of 10 random numbers between 55-100, then sort in order from smallest to largest.
    public int[] randMaxMinSort() {
        Random r = new Random();

        int i = 0;
        int[] arr;
        arr = new int[10];

        // Generates randomized array of 10 numbers between 55-100
        while (i < 10) {
            // Sets params for nextInt
            int low = 55;
            int high = 100;

            arr[i] = r.nextInt(high-low) + low;
            i++;
        }

        // Sorts the array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The minimum number in the array is: " + arr[0] + " and the maximum value is: " + arr[arr.length-1]);
        return arr;
    }

    // Generate a random string that is 5 characters long
    public String randString() {
        // Creates an char array of the alphabet
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random r = new Random();
        String newString = "";
        int i = 0;

        // Loop to create the new string
        while (i < 5) {
            newString += alpha[r.nextInt(25)];
            i++;
        }
        
        return newString;
    }

    // Generates an array with 10 randoms strings that are 5 charaters long
    public String[] randStringArr() {
        // Creates an char array of the alphabet
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random r = new Random();
        String[] strArr = new String[10];

        // Loop to create the array
        for(int i = 0; i < strArr.length; i++) {
            // Loop to create new string
            int j = 0;
            String newString = "";
            while (j < 5) {
                newString += alpha[r.nextInt(25)];
                j++;
            }
            strArr[i] = newString;
        }

        return strArr;
    }
}