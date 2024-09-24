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

    static void MergingArrayInPlace(int[]arr,int s,int e){
        if(e-s==1){
            return;
        }
//        int mid=arr.length/2;
        int mid=(s+e)/2;
       MergingArrayInPlace(arr,s,mid);
       MergingArrayInPlace(arr,mid,e);
         mergeInPlace(arr,s,mid,e);
    }
    private static void mergeInPlace(int []arr,int s,int mid,int e){
        int []mix=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid&& j< e){
            if (arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array may not be finished
        while(i< mid){
            mix[k]=arr[i];
            i++;
            k++;

        }
        while(j< e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];

        }

    }

    public static void main(String[] args) {
    int []arr={83,4,1,2,32};
//   int []newArr= MergingArray(arr);
//        System.out.println(Arrays.toString(newArr));
        MergingArrayInPlace(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
