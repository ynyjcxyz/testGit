import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("pineapple");
        list.add("banana");
        System.out.println("There are: " + list.size() + " elements in this list");
        for(Iterator<String> it = list.iterator(); it.hasNext(); ){
            String s = it.next();
            System.out.println(s);
        }
    }
}