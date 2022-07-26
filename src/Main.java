import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        public class Main {
            public  static boolean checkPrime(int j){
                if (j < 2 ){
                    return false;
                }for (int i = 2 ; i <= Math.sqrt(j);i++){
                    if (j % i ==0){
                        return false;
                    }
                }
                return  true;
            }

            public static void main(String[] args) {
                 Scanner scanner = new Scanner(System.in);


                System.out.println("Nhập số");
                int number = scanner.nextInt();
                int j = 2 ;
                while (j < number){
                    if (checkPrime(j)){
                        System.out.println(j);
                    }
                    j++;
                }


            }
        }
    }
}