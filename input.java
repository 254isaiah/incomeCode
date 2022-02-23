public class input {
    double income;
    // double tax = 30 / 100;
    double amount;

    public void incomegenerate(double income) {
        amount = income * 30 / 100;

        System.out.println("Tax your are to pay: "+amount);

    }

}
