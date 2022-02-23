import java.util.*;

public class userInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double incomeData = scan.nextDouble();
        System.out.println("Tax your are to pay is: ");

        System.out.println(incomeData * 30 / 100);
    }
}