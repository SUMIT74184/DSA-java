package RecursionArrays;

//Binary Search using the recursion
public class BinarySearch {
    static int BSearch(int []arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            return BSearch(arr,start,mid-1,target);

        }else{
            return BSearch(arr,mid+1,end,target);
        }
    }
    public static void main(String[] args) {
        int []arr={12,23,34,45,56,67,78,89,90};
        int target=89;
        int start=0;
        int end=arr.length;
       int result= BSearch(arr,0, arr.length, target);
        System.out.println(result);
    }
}
