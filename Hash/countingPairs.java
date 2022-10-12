import java.util.HashSet;

class Main {
    int arr[]=new int[] {1,4,45,6,10,8};
    static int getPairsCount(int[] n,int target){
        HashSet<Integer> set=new HashSet<Integer>();
        HashSet<Integer> seen=new HashSet<Integer>();
        int count=0;
        for(int num : n){
            if(set.contains(target-num) && !seen.contains(num)){
                count++;
                seen.add(target-num);
                seen.add(num);
            }
            else if(!set.contains(num)){
                set.add(num);
            }
        }
        return count;
    }
    public static void main(String[] args){
        int sum = 16;
       // System.out.println("Count of pairs is "+getPairsCount(arr.length,sum));
    }
}
