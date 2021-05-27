import java.util.Scanner;

public class bankingapp {
    public static void main(String [] args){

    }
}

class BankAccount {
    int balance;
    int PrevTransaction;
    String CostumerName;
    String CostumerID;

    BankAccount(String cname,String cID)
    {
        CostumerName = cname;
        CostumerID = cID;
    }

    void deposit(int amount)
    {
        if(amount != 0)
        {
            balance = balance + amount;
            PrevTransaction = amount;
        }
    }

    void withdraw(int amount)
    {
        if(amount != 0)
        {
            balance = balance - amount;
            PrevTransaction = -amount;
        }
    }

    void getPreviousTransaction()
    {
        if(PrevTransaction > 0)
        {
            System.out.println("Deposited: " +PrevTransaction);
        }
        else if (PrevTransaction < 0)
        {
            System.out.println("Withdrawn: " +Math.abs(PrevTransaction));
        }

        else
        {
            System.out.println("No transactions occured");
        }

    }

    void showMenu()
    {
        char option= '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome" +CostumerName);

        System.out.println("Welcome" +CostumerName);
        System.out.println("Your ID is " +CostumerID);
        System.out.println('\n');
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. WithDraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("Enter an option");
            System.out.println("--------------------------------------------------------");
            option = scanner.next().charAt(0);
            System.out.println('\n');

            switch (option) {
                case 'A':
                case 'a':
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Balence =" + balance);
                    System.out.println("--------------------------------------------------------");
                    System.out.println('\n');
                    break;

                case 'B':
                case 'b':
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Enter amount to deposit: ");
                    System.out.println("--------------------------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println('\n');
                    break;

                case 'C':
                case 'c':
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Enter the amount you want to withdraw: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println('\n');
                    break;
                case 'D':
                case 'd':
                    System.out.println("--------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("--------------------------------------------------------");
                    System.out.println('\n');
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }while(option != 'E');
        System.out.println("Thank you for using!");

    }

}