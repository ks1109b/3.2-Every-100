public class Main {
    public static void main(String[] args) {
        long balance = 1000_00;
        long refill = 1699_00;
        int limit = 1000_00;
        long bonus = refill / 100 / 100;
        if (refill < limit) {
            bonus = 0;
        }
        long total = balance / 100 + refill / 100 + bonus;
        System.out.println(total);
    }
}
