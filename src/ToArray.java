import java.util.List;
public class ToArray {
    public static void main(String[] args){
        List<Integer> list = List.of(12,34,56);
        Integer[] array = list.toArray(new Integer[3]);
        for(Integer n: array){
            System.out.print(n+" ");
        }
    }
}