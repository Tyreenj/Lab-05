import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int birthMonth;
        String trash;
        System.out.print("Enter your birth month [1-12]: ");

        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            if(birthMonth <= 12 && birthMonth >= 1)
            {
                System.out.println("Your birth month is " +birthMonth);
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nError 2, You did not enter a valid birth month: " +trash);
                System.out.println("Run the program again and enter a valid month!");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nError 1, You did not enter a valid birth month: " +trash);
            System.out.println("Run the program again and enter a valid month!");
        }
    }
}