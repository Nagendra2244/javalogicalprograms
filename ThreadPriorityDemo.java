class ThreadA extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        System.out.println("ThreadA....."+i);
        
    }
    
}
class ThreadB extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        System.out.println("ThreadB....."+i);
        }
    
}
public class ThreadPriorityDemo{
    public static void main(String args[]) {
        ThreadA ta=new ThreadA();
        ThreadB tb=new ThreadB();
        System.out.println("ThreadA default Priority is..."+ta.getPriority());
        System.out.println("ThreadB default Priority is..."+tb.getPriority());
        ta.setPriority(Thread.MAX_PRIORITY-2);
        tb.setPriority(3);
        System.out.println("ThreadA New Priority is..."+ta.getPriority());
        System.out.println("ThreadB New Priority is..."+tb.getPriority());
        ta.start();
        tb.start();
        Thread tm=Thread.currentThread();
        System.out.println("Main Thread default Priority is..."+tm.getPriority()):
        tm.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Main Thread New Priority is..."+tm.getPriority());
        for(int i=1;i<=5;i++)
        System.out.println("Main...."+i);
        
    }
    
}