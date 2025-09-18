import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args) {

        AtmOperationInterf op = new AtmOperationImpl();
        int atmNumber = 12345;
        int atmPin = 123;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ATM Machine!");
        System.out.print("Enter ATM number: ");
        int atmNumber1 = sc.nextInt();
        System.out.print("Enter PIN: ");
        int atmPin1 = sc.nextInt();

        if ((atmNumber == atmNumber1) && (atmPin == atmPin1)) {
            while (true) {
                System.out.println("\n1. View Available Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposit Amount");
                System.out.println("4. View Mini Statement");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        op.viewBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        op.withdrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        op.depositAmount(depositAmount);
                        break;
                    case 4:
                        op.viewMiniStatement();
                        break;
                    case 5:
                        System.out.println("Collect your ATM Card\nThank you for using ATM Machine");
                        System.exit(0);
                    default:
                        System.out.println("Please enter correct choice");
                }
            }
        } else {
            System.out.println("Incorrect ATM Number or PIN");
            System.exit(0);
        }
    }
}
