public class Main {
    public static void main(String[] args) {
        int balance = 2_000_000_000;
        int transfer = 500_000_000;
        int new_balance = balance + transfer;
        System.out.println("Баланс после перевода составляет " + new_balance);
    }
}
