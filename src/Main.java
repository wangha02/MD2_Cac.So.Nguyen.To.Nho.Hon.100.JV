import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        int j = 2;
        System.out.println("Enter number of prime: ");
        number = scanner.nextInt();
        while (count < number) {
            if (checkPrime(j)) {
                System.out.println(j);
                count++;
            }
            if (count >= number) {
                break;
            }
            j++;
        }
    }

    public static boolean checkPrime(int j) {
        if (j <= 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}