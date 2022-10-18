package baitap2;

public class OddThread extends Thread{
    @Override
    public void run(){
        try {
            for (int i = 1; i <= 10; i++) {
                if (i%2!=0){
                    System.out.println("Number odd: "+i);
                    Thread.sleep(10);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
