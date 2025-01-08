package javaGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class customArrayList {
    //taking constant time on average while we are adding the element
    private int[] data;
    private static int DEFAULT_SIZE=10;

    private int size=0;

    public customArrayList() {
        this.data=new int[DEFAULT_SIZE];
    }

    public void  getList(List<? extends Number>list){
        //whatever
    }

    public void add(int num){
        if (isFUll()) {
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public int remove(){
        int removed=data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }

    private boolean isFUll() {
        return size==data.length;

    }

    @Override
    public String toString() {
        return "customArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        customArrayList list=new customArrayList();
        list.add(3);
        list.add(34);
        list.add(45);
        list.add(67);
        System.out.println(list);
    }
}
