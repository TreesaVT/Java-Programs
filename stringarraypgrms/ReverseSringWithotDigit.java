package stringarraypgrms;
import java.util.Arrays;
public class ReverseSringWithotDigit {

    public static void main(String[] args) {
        String str = "abc123pqr567xyz890";
        System.out.println("Original: " + str);

        int left = 0;
        int right = str.length() - 1;

        char[] ch = str.toCharArray();

        while (left < right) {
            if (Character.isDigit(ch[left])) {
                left++;
            } else if (Character.isDigit(ch[right])) {
                right--;
            } else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Reverse String: " + new String(ch));
        //System.out.println(Arrays.toString(ch));
    }
}



