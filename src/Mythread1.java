class Mythread1 extends Thread{
    public void run(){
//        for (int i = 0; i <10 ; i++) {
//            System.out.println("Mythread"+i);
//        }
        System.out.println(10/0);
    }
}
class Test56
{
    public static void main(String[] args) {
        Mythread1 obj = new Mythread1();
        //or
        // thread obj1 = new Mythread1();  // polymorphic behaviour

        obj.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("mainthread"+i);
        }
    }
}
