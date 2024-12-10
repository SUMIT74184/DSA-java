package RecursionArrays;


import java.util.ArrayList;

public class linearsearch {

    public static void main(String[] args) {
        int []arr={23,34,45,56,67,78,78,78};
        int target=78;
        System.out.println(FindIndexLinear(arr,0,target));
        System.out.println("value is "+find(arr,0,target));
//      FindAllIndex(arr,0,target);
//        System.out.println(list);

        //passing the function with list call
        System.out.println("returning the list :");
        System.out.println(FindList(arr,target,0,list));

        //making the new array everytime in the recursive call
        System.out.println(FindList2(arr,target,0));
    }
    //just normal returning the true and false
  public static boolean find(int []arr ,int index,int target){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,index+1,target);
    }
    //finding the index of the arrays
    public static int FindIndexLinear(int []arr,int index,int target) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return FindIndexLinear(arr, index + 1, target);
        }
    }
    //returning the entire list of same element present in the particular index
        static ArrayList<Integer>list=new ArrayList<>();
    public static void FindAllIndex(int []arr,int index,int target) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);

        }
       FindAllIndex(arr, index + 1, target);
    }

    static ArrayList<Integer> FindList(int []arr,int target,int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return FindList(arr,target,index+1,list);
    }
    static ArrayList<Integer> FindList2(int []arr,int target,int index){
        ArrayList<Integer>list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
         ArrayList<Integer>ansFromBelow= FindList2(arr,target,index+1);
        list.addAll(ansFromBelow);
        return list;
    }

}
