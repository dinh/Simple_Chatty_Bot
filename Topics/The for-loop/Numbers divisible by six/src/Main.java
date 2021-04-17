import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (value % 6 == 0) {
                sum += value;
            }

        }
        System.out.print(sum);
    }
}