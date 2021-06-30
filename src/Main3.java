import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main3 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println("使用for循环:");
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
        System.out.println("使用foreach循环:");
        for(int element:arr){
            System.out.println(element);
        }
        System.out.print("For-Each循环二维数组:");
        int[][] arr2 = { {1,2,3},{4,5,6},{7,8,9} };
        for(int[] row : arr2){
            System.out.println();
            for(int element : row){
                System.out.print(element);
            }
        }
        List<String> list = new ArrayList<String>();
        list.add("job");
        list.add("family");
        list.add("life");
        //List<String> list = List.of("job", "family", "life");

        System.out.println("\n方式1-普通循环：");
        for(int j=0 ; j < list.size() ; j++){
            System.out.println(list.get(j));
        }

        System.out.println("方式2-使用迭代器：");
        for(Iterator<String> iter = list.iterator();iter.hasNext(); ){
            System.out.println(iter.next());
        }

        System.out.println("方式3-For-Each循环：");
        for(String str: list){
            System.out.println(str);
        }
    }
}