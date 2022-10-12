import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> arr1=new HashSet<>();
        arr1.add(11);
        arr1.add(1);
        arr1.add(13);
        arr1.add(21);
        arr1.add(3);
        arr1.add(7);
        Set<Integer> arr2=new HashSet<>();
        arr2.add(11);
        arr2.add(3);
        arr2.add(7);
        arr2.add(1);
        boolean res=arr1.containsAll(arr2);
        System.out.println("Is Array 2 a subset of Array 1? ");
        if(res==true){
            System.out.println("Yes, it is.");
        }
        else if(res==false){
            System.out.println("No, it is not.");
        }
    }
}
