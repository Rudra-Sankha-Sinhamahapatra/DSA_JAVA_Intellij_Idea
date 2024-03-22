package com.rudra.DSA.Stacks_and_Queues.Stacks;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        //this takes care of being full
        if(this.isFull()){
            //double the array size
            int[]temp=new int[data.length+2];

            //copy all previous item on new data
            for(int i=0;i< data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        //at this point we know that array is not full
        //insert item
        return super.push(item);
    }
}
