//class Topic1 implements Runnable{
//    @Override
//    public void run(){
//        Thread.currentThread().setName("Himanshu custom Thread");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName());
//        }
//    }
//}
//
//class Test57
//{
//    public static void main(String[] args) {
//        Topic1 obj = new Topic1();
//        Thread obj1 = new Thread(obj);
//        obj1.start();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("main thread");
//        }
//    }
//}



//class Topic1 implements Runnable{
//    @Override
//    public void run(){
//        Thread.currentThread().setName("Himanshu custom Thread");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName());
//        }
//    }
//}

class Test57
{
    public static void main(String[] args) {
//        Topic1 obj = new Topic1();

        // without lambda

//        Thread obj1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Thread.currentThread().setName("Himanshu custom Thread");
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName());
//                }
//            }
//        });


        // with lambda

        Thread obj1 = new Thread(() -> {
            Thread.currentThread().setName("Himanshu custom Thread");
    for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName());
    }
        });
        obj1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}