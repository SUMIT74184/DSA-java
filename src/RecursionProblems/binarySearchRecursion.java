package RecursionProblems;

public class binarySearchRecursion {
//comparing with constant time
//dividing into two equal half
//F(N)=O(1)+F(N/2)

    public static int Search(int[]arr,int target,int start,int end){

        if(start>end){
            return -1;
        }
       int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }else if(target<arr[mid]){
           return Search(arr,target,start,mid-1);
        }else{
            return Search(arr,target,mid+1,end);
        }
    }

    public static void main(String[] args) {

        int[]a={11,22,33,44,55,66,77,88,99};
        int target=44;
        System.out.println(Search(a,target,0,a.length-1));
    }
}
