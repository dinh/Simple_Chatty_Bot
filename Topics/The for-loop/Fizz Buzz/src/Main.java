import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String s;
        for (int i = n; i <= m; i++) {
            s = i % 15 == 0 ?"FizzBuzz" :
                    i % 5 == 0 ? "Buzz" :
                        i % 3 == 0 ? "Fizz" : i + "";

            System.out.println(s);

        }
    }
}