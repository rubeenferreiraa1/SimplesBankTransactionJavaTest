import java.util.Scanner;

class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        //int a = scanner.nextInt();
        char c = scanner.next().charAt(0);
        System.out.println("value = " +c);
        
    }
}