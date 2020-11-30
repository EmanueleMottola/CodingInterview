import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasUniqueValues("Help me handle the coding interview!"));
        System.out.println(checkPermutation("code is awsome!", "some code isaw!"));
        System.out.println(URLify("Mr John Smith    ", 13));
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

    /*
     Ex 1.3
     */
    public static String URLify(String input, int length){
        char[] str = input.toCharArray();
        for (int i = 0; i < length; i++){
            if (str[i] == ' '){
                length += 2;
                for ( int j = length - 1; j >= i; j-- ){
                    str[j] = str[j-2];
                }
                str[i] = '%';
                str[++i] = '2';
                str[++i] = '0';
            }
        }
        return String.valueOf(str);
    }
}
