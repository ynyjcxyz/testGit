import java.util.ArrayList;
import java.util.List;
public class Main4 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        //List<String> list = List.of("A", "B", "C");
        System.out.println(list.contains(new String("C")));
        System.out.println(list.indexOf(new String("C")));
    }
}
