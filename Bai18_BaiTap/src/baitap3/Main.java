package baitap3;

public class Main {
    public static void main(String[] args) {
        LazyPrime lazyPrime = new LazyPrime("lazy");
        OptimizedPrime optimizedPrime = new OptimizedPrime("Optimized");

        lazyPrime.start();
        optimizedPrime.start();
    }
}
