package Java8;

import java.util.Arrays;
import java.util.List;

public class SharmaCode  {
    public static void main(String[] args) 
    {
        List<String> l1 = Arrays.asList("adinarayana","ganesh","raju");
        l1.stream().map(x -> x+"_sharma").forEach(x -> System.out.println(x));

    }
}