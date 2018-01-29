package threadpoolexecutor;

public class WorkerThread implements Runnable {

    private String command;

    public WorkerThread(String cmd){
        this.command = cmd;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " Start. Command= " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End. Command= " + command);
    }

    public void processCommand(){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException exp){
            exp.printStackTrace();
        }

    }
}
