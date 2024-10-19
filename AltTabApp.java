import java.util.*;
public class AltTabApp {

    public static void rearrange(int arr[] ,int n, int k ){
        
        int index = k % n ;
        int id = arr[index];

        for (int  i = index ; i > 0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = id;
    }
    public static void main(String[] args){
        int[] arr = {3, 5, 2, 4, 1};
        int n = arr.length;  
        int k = 3;
        rearrange(arr, n , k);

        System.out.println("Rearrange" +Arrays.toString(arr));
        

    }
}
