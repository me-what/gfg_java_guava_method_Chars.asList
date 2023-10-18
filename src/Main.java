import com.google.common.primitives.Chars;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c' };
        List<Character> myList = Chars.asList(arr);
        System.out.println(myList); // [a, b, c]


        char arr2[] = { 'H', 'E', 'L', 'L', 'O' };
        List<Character> myList2 = Chars.asList(arr2);
        System.out.println(myList2);
    }
}