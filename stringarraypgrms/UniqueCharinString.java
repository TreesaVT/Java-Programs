package stringarraypgrms;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class UniqueCharinString {



    public static void main(String[] args) {
        String s = "Hello";
        char [] c  = s.toCharArray();
        Set<Character> uniqueCharacter = new LinkedHashSet<Character>();
        for(int i =0;i<c.length;i++){
            uniqueCharacter.add(c[i]);
        }
        System.out.println(uniqueCharacter);
    }
}