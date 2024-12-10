package RecursionArrays;

public class RecursionArray {

    public static void main(String[] args) {
    int []arr={23,34,45,56,78,89,22};
        System.out.println(SortedOrNot(arr,0));
//
    }
    static boolean SortedOrNot(int []arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && SortedOrNot(arr, index+1);

    }
}
