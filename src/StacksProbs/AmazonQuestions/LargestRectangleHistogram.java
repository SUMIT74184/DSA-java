package StacksProbs.AmazonQuestions;

import java.util.Stack;

public class LargestRectangleHistogram {
    public int largestRectangleArea(int []height){
        int []ns=findNextSmaller(height);
        int []ps=findPrevSmaller(height);

        int max=Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            int h=height[i];
            int w=ns[i]-ps[i]-1;
             max=Math.max(max,(h*w));
        }

        return max;
    }
    public static int []findNextSmaller(int []arr){
        int n=arr.length;
        Stack<Integer>stack=new Stack<>();
        int []res=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=n;//we need to provide the final element
            }else{
                res[i]=stack.peek();
            }
            stack.push(i);//need to store only index
        }
        return res;
    }

 public static int []findPrevSmaller(int []arr){
        int n=arr.length;
        Stack<Integer>stack=new Stack<>();
        int []res=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=-1;//we need to provide the final element
            }else{
                res[i]=stack.peek();
            }
            stack.push(i);//need to store only index
        }
        return res;
    }


//    class Solution { optimised solution
//        public int largestRectangleArea(int[] heights) {
//            //o(2N)--time complexity
//            Stack<Integer>stack=new Stack<>();
//            int n=heights.length;
//            int max=Integer.MIN_VALUE;
//            for(int i=0;i<=n;i++){
//                int element=(i==n)?0:heights[i];
//                while(!stack.isEmpty() && heights[stack.peek()]>element){
//                    int h=heights[stack.pop()];
//                    int ps=(stack.isEmpty())?-1:stack.peek();
//                    int w=i-ps-1;
//                    max=Math.max(max,h*w);
//                }
//                stack.push(i);
//            }
//            return (max==Integer.MIN_VALUE)?0:max;
//        }
//    }

    public static void main(String[] args) {
        int []arr={2,1,5,6,2,3};
        LargestRectangleHistogram lrh = new LargestRectangleHistogram();
        int na=(lrh.largestRectangleArea(arr));
        System.out.println(na);
    }
}
