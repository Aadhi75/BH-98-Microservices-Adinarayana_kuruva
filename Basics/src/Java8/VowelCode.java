package Java8;

import java.util.Arrays;
import java.util.List;

public class VowelCode {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("adinarayana","ganesh","raju");

        l1.stream().map(str -> { String x="";
            for(int i=0; i<str.length(); i++) 
            {
            	char ch = str.charAt(i);
                if(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') 
                    x=x+ch;
            }
            return x;
        }).forEach(x -> System.out.println(x));
    }
}