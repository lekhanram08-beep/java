import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
        int a = sc.nextInt();
		System.out.println("Enter Second Number:");
        int b = sc.nextInt();
		System.out.println("Enter Third Number:");
        int c = sc.nextInt();
        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
		System.out.println("The Largest Number:");
        System.out.println(largest);
        sc.close();
    }
}

