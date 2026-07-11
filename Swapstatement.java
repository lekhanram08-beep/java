import java.util.Scanner;
public class Swapstatement{
	static void exchangeBalances(int firstBalance, int secondBalance){
		System.out.println("\nAccount A Balance :" + firstBalance);
		System.out.println("\nAccount B Balance :" + secondBalance);
		firstBalance += secondBalance;
        secondBalance = firstBalance - secondBalance;
        firstBalance -= secondBalance;
		System.out.println("\nAccount A Balance : " + firstBalance);
        System.out.println("\nAccount B Balance : " + secondBalance);
	}

	    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Account A Balance: ");
        int accountA = input.nextInt();
        System.out.print("Enter Account B Balance: ");
        int accountB = input.nextInt();
        exchangeBalances(accountA, accountB);
        input.close();
    }
}