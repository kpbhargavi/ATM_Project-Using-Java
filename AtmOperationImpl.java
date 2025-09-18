import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImpl implements AtmOperationInterf {

    Atm atm = new Atm();
    Map<Double, String> ministmt = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministmt.put(withdrawAmount, " Amount withdrawn");
                System.out.println("Collect the cash: " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Please enter the amount in multiples of 500");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount, " Amount Deposited");
        System.out.println(depositAmount + " Deposited Successfully!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        if (ministmt.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            Set<Double> set = ministmt.keySet();
            for (Double d : set) {
                System.out.println(d + " = " + ministmt.get(d));
            }
        }
    }
}
