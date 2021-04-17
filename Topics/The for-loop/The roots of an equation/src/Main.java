import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        for (int x = 0; x <= 1000; x++) {
            if (a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d == 0 && count < 3) {
                System.out.println(x);
                count++;
            }
        }
    }
}
