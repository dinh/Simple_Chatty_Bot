import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        // put your code here
        for (int i = a; i <= b; i++) {    
            sum += i;
        }
        System.out.println(sum);
    }
}
