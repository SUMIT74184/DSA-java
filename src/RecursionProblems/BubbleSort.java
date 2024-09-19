package RecursionProblems;

import java.util.Arrays;

public class BubbleSort {
    static void Bubble(int []arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            Bubble(arr,r,c+1);
        }else{
            Bubble(arr,r-1,0);
        }
    }
    public static void main(String[] args) {
         int []arr={56,78,43,21,45,211};
        Bubble(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
}
