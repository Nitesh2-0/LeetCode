package LeetCode;
import java.util.Arrays;
public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] res = new int[arr.length];
        Arrays.fill(res,-1);
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        for(int j : res){
            System.out.print(j + " ");
        }
    }
}
