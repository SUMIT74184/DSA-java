package RecursionArrays;

public class RotatedBs {
    static int Search(int []arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target <=arr[mid]){
                return Search(arr,target,start,mid-1);
            }else{
                return Search(arr,target,mid+1,end);
            }
        }
        if(target>=arr[mid] && target <=arr[end]){
            return Search(arr,target,mid+1,end);
        }else{
            return Search(arr,target,start,mid-1);
        }
    }

    public static void main(String[] args) {
    int []arr={5,6,7,8,9,1,2,3,4};
    int target=7;
    int start=0;
    int end= arr.length;
        System.out.println(Search(arr,target,start,end));
    }
}
