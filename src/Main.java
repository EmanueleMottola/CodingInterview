import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        hasUniqueValues("Help me handle the coding interview!");
    }

    /*
    Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
        cannot use additional data structures?
     */
    public static boolean hasUniqueValues(@NotNull String str){

        char[] temp = str.toCharArray();
        Arrays.sort(temp); // O(N log N)

        for (int i=0; i < temp.length; i++){
            if (temp[i] == temp[i+1])
                return true;
        }
        return false;
    }

}
