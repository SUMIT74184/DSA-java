package StacksProbs.AmazonQuestions;

import java.util.Stack;

public  class NextGreaterElement {
    public static long[]NGE(long[]arr,int m){
        Stack<Long> st=new Stack<>();
//        int m= arr.length;
        long []res=new long[m];
        for(int i=m-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;//if no element is greater than insert -1
            }else {
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
    int m=4;
    long[]arr={1,3,2,4};
   long []ans= NGE(arr,m);
        for (long an : ans) {
            System.out.println(an);
        }
    }
}
