package com.rudra.oops6_generics;

import java.util.ArrayList;

public class CustomArrayList {

  private int[]data;
  private int DEFAULT_SIZE =10;
  private int  size=10;

    public CustomArrayList() {
        data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[]temp=new int[data.length * 2];

        //copy the current items in the new array
        for (int i = 0; i <data.length ; i++) {
          temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }


    public static void main(String[] args) {
        ArrayList list=new ArrayList();
    }
}
