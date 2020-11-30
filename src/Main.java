import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        hasUniqueValues("Help me handle the coding interview!");
        checkPermutation("code is awsome!", "some code is aw!");
    }

    /*
    Ex 1.1
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

    /*
     Ex 1.2
    */
    public static boolean checkPermutation(String a, String b){
        if (a.length() != b.length())
            return false;

        char[] a_copy = a.toCharArray();
        char[] b_copy = b.toCharArray();

        Arrays.sort(a_copy);
        Arrays.sort(b_copy);

        return Arrays.equals(a_copy, b_copy);
    }

}
