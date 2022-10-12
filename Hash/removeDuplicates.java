import java.util.*;

public class Main {
    public static void removeDuplicates(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                System.out.print(+arr[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,4,6,6,6};
        removeDuplicates(arr);
    }
}
