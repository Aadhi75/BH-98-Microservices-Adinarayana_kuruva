package Java8;

import java.util.Arrays;
import java.util.List;

public class SurnameCode {
    public static void main(String[] args)  {
        List<String> l1 = Arrays.asList("raju","adinarayana","ganesh");
        List<String> l2 = Arrays.asList("bhashabathini","kuruva","renikunta");
        l1.stream().map(x -> x +"_"+ l2.get(l1.indexOf(x))).forEach(x -> System.out.println(x));
        
    }
}