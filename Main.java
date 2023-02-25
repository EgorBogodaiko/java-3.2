
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
class Main
{
    public static void main(String[] args)
    {
        Integer[] array = { 6, 8, 3, 5, 1, 9 };
        List<Integer> ints = Arrays.asList(array);
        System.out.println("Min element is " + Collections.min(ints));
        System.out.println("Max element is " + Collections.max(ints));
    }
}