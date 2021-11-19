class Test extends Thread{
    public void run(){
        System.out.println(10/0);
    }
}

class Test1 extends Thread{
    public void run(){
        int arr[] ={1,2,3,4};
        System.out.println(arr[6]);
    }
}

class Test2 extends Thread{
    public void run(){

    }
}