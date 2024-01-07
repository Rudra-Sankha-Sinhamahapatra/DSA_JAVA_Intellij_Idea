package com.rudra.oops4_access;

public class ObjectDemo {
    int num;
    float val;
    public ObjectDemo(int num,float val) {
        this.num = num;
        this.val=val;
    }

    //it basically returns the to string
    @Override
    public String toString() {
        return super.toString();
    }

    // it returns when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }



    // follow hashmaps
    @Override
    public int hashCode() {
        return super.hashCode();
        //return num ;
        //it will return num in the "return num" case
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num==((ObjectDemo)obj).num;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(18,41.9f);
        ObjectDemo obj2=new ObjectDemo(18,78.5f);
        ObjectDemo obj3=obj;
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        //hashcode returns a random number so that we can identify whether the object is
        //the same or not
        if(obj==obj2) {
            System.out.println("obj is equal to obj2");
        }

        if(obj==obj3) {
            System.out.println("obj is equal to obj3");
        }

        if(obj.equals(obj2)){
            System.out.println("obj is equal to obj2");
        }

        System.out.println(obj.getClass().getName());

    }
}
