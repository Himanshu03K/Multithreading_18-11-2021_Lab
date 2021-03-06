class Mythread extends Thread {
    public static void main(String[] args) {
        Thread obj = Thread.currentThread();
        obj.setName("Himanshu");   // to set the name of thread we use setName() function

        System.out.println(obj.isAlive());  // is used to know the state of thread  (running or not running)

        System.out.println(obj.getName());  // to print the name of thread

        System.out.println(obj.isDaemon()); // Low Priority thread which runs in background is known Daemon thread()

        System.out.println(obj.getPriority());  // to known the Priority

        System.out.println(Thread.MAX_PRIORITY);  // to change the Priority of thread

        System.out.println(obj.getId());
        //System.out.println(obj.getStackTrace());
        //System.out.println(obj.countStackFrames());
        System.out.println(obj.getContextClassLoader());
        //System.out.println(10/0);
    }
}
