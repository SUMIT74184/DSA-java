package StringRecursionQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iterativeApprSubset
{
    static List<List<Integer>>subset(int[] nums){
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:nums){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer>internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }

        }
    return outer;
    }


//    static List<List<Integer>>subsetDuplicate(int[] nums){
//        Arrays.sort(nums);
//        List<List<Integer>>outer=new ArrayList<>();
//        outer.add(new ArrayList<>());
//        int start=0;
//        int end=0;
//        for()
//        for(int num:nums){
//            int n=outer.size();
//            for(int i=0;i<n;i++){
//                List<Integer>internal=new ArrayList<>(outer.get(i));
//                internal.add(num);
//                outer.add(internal);
//            }
//
//        }
//        return outer;
//    }
    public static void main(String[] args) {
    int []nums={1,2,3};
    List<List<Integer>>ans=subset(nums);
    for(List<Integer>list:ans){
        System.out.println(list);
    }
    }
}
