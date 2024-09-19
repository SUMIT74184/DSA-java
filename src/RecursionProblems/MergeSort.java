package RecursionProblems;

import java.util.Arrays;

public class MergeSort {
    static int[] MergingArray(int[]arr){
    if(arr.length==1){
        return arr;
    }
    int mid=arr.length/2;
    int[] leftArr=MergingArray(Arrays.copyOfRange(arr,0,mid));
    int[] RightArr=MergingArray(Arrays.copyOfRange(arr,mid,arr.length));
    return merge(leftArr,RightArr);
    }
    private static int[]merge(int []first,int []second){
        int []mix=new int[first.length+ second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j< second.length){
            if (first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array may not be finished
        while(i< first.length){
            mix[k]=first[i];
            i++;
            k++;

        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    public static void main(String[] args) {
    int []arr={83,4,1,2,32};
   int []newArr= MergingArray(arr);
        System.out.println(Arrays.toString(newArr));
    }
}
