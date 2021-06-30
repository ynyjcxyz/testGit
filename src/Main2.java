public class Main2 {
    public static void main(String[] args){
        int[] intary = {1,2,3,4};
        forDisplay(intary);
        foreachDisplay(intary);
    }
    public static void forDisplay(int[] x){
        System.out.println("for loop:");
        for(int i=0 ; i<x.length ; i++){
            System.out.println(x[i]);
        }
        System.out.println();
    }
    public static void foreachDisplay(int[] y){
        System.out.println("foreach loop:");
        for(int a: y){
            System.out.println(a);
        }
    }
}