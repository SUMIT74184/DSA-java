package StacksProbs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class OnlineStockSpan {
    //new pattern for the monotonic--to reduce the time complexity
//    we need to check the value which are smaller than the current price
    Stack<Integer> st=new Stack<>();
    ArrayList<Integer> list=new ArrayList<>();

    public int next(int price) {

        list.add(price);

        while(!st.isEmpty() && list.get(st.peek())<=price){
            st.pop();
        }
        int PrevGreaterIndex=(st.isEmpty())?-1:st.peek();
        int currentIndex=list.size()-1;
        int ans=currentIndex-PrevGreaterIndex;
        st.push(currentIndex);
        return ans;

    }



    public static void main(String[] args) {
        System.out.println();
    }
}
