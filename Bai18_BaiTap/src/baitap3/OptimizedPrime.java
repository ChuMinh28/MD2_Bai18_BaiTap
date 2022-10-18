package baitap3;

import baitap2.Main;

public class OptimizedPrime implements Runnable {
    private Thread myThread;
    private final String threadName;

    OptimizedPrime(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        try {
            int count = 0;
            int N = 2;
            int number = 20;
            boolean check;
            int cnt = 1;
            while (count < number) {
                check = false;
                int squareRoot = (int) Math.sqrt(N);
                for (int i = 2; i < squareRoot; i++) {
                    if (N % i == 0) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    System.out.println(cnt + ".Optimized: " + N);
                    count++;
                }
                N++;
                cnt++;
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (myThread == null) {
            myThread = new Thread(this, threadName);
            myThread.start();
        }
    }
}
