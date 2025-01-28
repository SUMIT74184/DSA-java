package StacksProbs.AmazonQuestions;

import java.util.Stack;

public class NextGreaterElement2 {
    public static int[]NGE2(int[]nums){
//        circular traversal right or left pointer
        //we are placing one for iteration into this
        Stack<Integer>stack=new Stack<>();
        int n=nums.length;
        int []res=new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i%n]) {
                stack.pop();
            }
                if (i < n) {
                    if (stack.isEmpty()) {
                        res[i] = -1;
                    } else {
                        res[i] = stack.peek();
                    }
                }
                stack.push(nums[i%n]);
        }
        return res;
    }

    public static void main(String[] args) {

        int []arr={12,24,1,9,20,13,11,45};
       int []ans= NGE2(arr);
       for(int i=0;i<ans.length;i++){
           System.out.println(ans[i]);
       }
        System.out.println();
    }
}
