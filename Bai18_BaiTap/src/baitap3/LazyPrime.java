package baitap3;

public class LazyPrime implements Runnable{
    private final String threadName;
    private Thread thread;
    LazyPrime(String name){
        threadName = name;
        System.out.println("Creating "+threadName);
    }
    @Override
    public void run() {
        try {
            int count = 0;
            int N = 2;
            int number = 20;
            boolean check;
            int cnt =1;
            while (count<number){
                check = false;
                for (int i = 2; i < N; i++) {
                    if (N % i == 0) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    System.out.println(cnt+".Lazy: "+N);
                    count++;
                }
                N++;
                cnt++;
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void start(){
        System.out.println("Starting "+threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
