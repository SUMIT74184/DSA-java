package StacksProbs.AmazonQuestions;

import java.util.Stack;

public class HelpClassMate {
    public static int[] help_classMates(int[]arr,int n){
//        next smallerElement
        Stack<Integer> st=new Stack<>();
        int []res=new int[n];
        for(int i=n-1;i>=0;i--){
            while (!st.isEmpty() && st.peek()>=arr[i]) {
                st.pop();
            }
                if(st.isEmpty()){
                    res[i]=-1;
                }else{
                    res[i]=st.peek();
                }
                st.push(arr[i]);//we are also pushing that element into the stack after the operation
            }
        return res;
    }

    public static void main(String[] args) {
        int n=5;
        int []arr={3,8,5,2,25};
        int []ans=help_classMates(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }

}
