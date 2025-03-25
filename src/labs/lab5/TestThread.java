package labs.lab5;

public class TestThread {
    public long sum() {
        long sum = 0;
        for (int i = 0; i < 1_000_000_000; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        TestThread cal = new TestThread();
        long start = System.currentTimeMillis();
        long sum = cal.sum();
        long end = System.currentTimeMillis();
        System.out.println("sum: " + sum);
        System.out.println("Time is ms: " + (end - start));
    }
}


