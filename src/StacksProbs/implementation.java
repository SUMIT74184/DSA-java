package StacksProbs;

import java.util.Scanner;
import java.util.Stack;

//array based implementation
    public class implementation {
    int []stacksize;
    int top;
    int size;
    public implementation(int stacksize){
        this.stacksize=new int[stacksize];
        this.size=stacksize;
        this.top=-1;//because the pointer is always -1
    }
    //works on the last in first out

    //peek --provide element on the top of the stack
    //pop -- delete the element from stack
    //isEmpty---check whether the stack is empty or not  top<=-1
    //size---top+1
    //stack can hold the duplicate element because these are unique ones
        public void push(int element){
        if(top>=size-1){
            System.out.println("stack is completely filled---overflow condition");
            return;
        }
        top++;//incrementing the size in the stack
        stacksize[top]=element;//giving the value in the stack
    }
        public boolean isEmpty(){
        return top<=-1;
        //this will return rhe stack is empty or not
    }
        public int size(){
        return top+1;  //array based indexing is not understandable that's why top+1
        }
        public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return Integer.MIN_VALUE;
        }
        return stacksize[top];
        }

        public int pop(){
        int val=peek();
        if(val!=Integer.MIN_VALUE){
            top--;
        }
        System.out.println("value is deleted");
        return val;
    }

    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.print(stacksize[i]);
            if(i!=top){
                System.out.println(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n=6;
        implementation im=new implementation(n);
        im.push(2);
        im.push(4);
        im.push(5);
        im.push(67);
        im.push(32);
        im.push(78);
        im.printStack();

        System.out.println("The top element of the stack is "+im.peek());
        System.out.println("size of the stack is"+im.size());

        System.out.println("deleting the element from the stack "+im.pop());
        System.out.println("new element on the top"+im.peek());

        System.out.println();

        Stack<Integer>str=new Stack<>();
        str.push(43);

    }
}
