
    import java.util.Scanner;

public class Armstrong {

    
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); 

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits); 
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void printArmstrongNumbersInRange(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        printArmstrongNumbersInRange(start, end);

        scanner.close();
    }
}
    

