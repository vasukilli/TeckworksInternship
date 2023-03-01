import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string to concatenate: ");
        String secondString = scanner.nextLine();

        String result = firstString.concat(secondString);

        System.out.println("The concatenated string is: " + result);
    }
}