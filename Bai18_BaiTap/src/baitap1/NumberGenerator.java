package baitap1;

public class NumberGenerator implements Runnable{

    @Override
    public void run() {
      try {
          for (int i = 1; i <= 10; i++) {
              System.out.println("Printing Number: "+i+" HashCode"+hashCode());
              Thread.sleep(500);
          }
      }catch (InterruptedException e){
          System.out.println("Nothing happened");
      }
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();
        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);
        thread1.start();
        thread2.start();
    }
}
