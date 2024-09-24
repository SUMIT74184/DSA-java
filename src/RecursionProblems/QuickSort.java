package RecursionProblems;

import java.util.Arrays;

public class QuickSort {
    //using recursion we will solve this problem
    //asked directly in the interviews
static void NewSort(int[]nums,int low,int high){
//    low and high are the parts which we are working on the partitions
    if(low>=high){
        return ;
    }
    int start=low;
    int end=high;
    int mid=start+(end-start)/2;
    int pivot=nums[mid];

    //also a reason why if it is sorted it will not swap
    while (start<=end){
        while (nums[start]<pivot){
            start++;
        }
        while(nums[end]>pivot){
            end--;
        }
        if(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    }

    //now the pivot is in the correct position
    NewSort(nums,low,end);
    NewSort(nums,high,start);
}

    public static void main(String[] args) {
        //
        int[]arr={12,3,4,5,21,34,1,341};
        NewSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

//        internal sorting algorithms
//        Arrays.sort(arr);
    }
}
