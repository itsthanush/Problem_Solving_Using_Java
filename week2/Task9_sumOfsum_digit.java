public class Task9_sumOfsum_digit {
    public static void main(String[] args) {

        int n=582109;
    String s = String.valueOf(n);
    int total = 0;

    for (int i = 0; i < s.length(); i++) {
        int digit = s.charAt(i) - '0';
        total += digit * (i + 1);
    }

    System.out.println(total);
    }
}