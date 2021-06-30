import java.util.List;
public class Loop {
    public static void main(String[] args){
        List<String> list = List.of("apple","pear","banana");
        for(String s: list){
            System.out.print(s + " ");
        }
    }
}