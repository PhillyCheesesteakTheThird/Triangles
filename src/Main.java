import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Runs the method triangleRunner from main conditionally based on user's input

        System.out.println("Would you like to make a triangle? (Y/N)");
        String response = scanner.nextLine().toLowerCase(Locale.ROOT);
        boolean isTrue  = response.equals("y");
        if(isTrue){triangleRunner();}

    }
    public static void triangleRunner() {
        //Initializes isTrue bool for first run
        boolean isTrue = true;
        //On first run isTrue is always true, but at the end of each run it is assigned either true or false conditionally
        //See line 43
        while(isTrue) {
            //Initializes scanner object for user responses
            Scanner scanner = new Scanner(System.in);
            int size;
            char fillChar;
            System.out.println("What is the side-length of your equilateral triangle?");
            size = scanner.nextInt();
            //Same while loop as the one wrapping the whole method.
            //runs on some condition then assigns a value to be evaluated in the condition at the end.
            while ((size > 50) || (size < 1)) {
                System.out.println("I'm sorry your side-length is outside of my range (1-50). \nPlease submit a new side-length: ");
                size = scanner.nextInt();
            }
            System.out.println("What fill character would you like for your triangle?");
            fillChar = scanner.next().charAt(0);
            System.out.println("Here's your triangle: ");
            //Runs the triangleMaker method with the user's provided arguments
            triangleMaker(size, fillChar);
            System.out.println("Would you like to make another triangle? (Y/N)");
            String response = scanner.next().toLowerCase(Locale.ROOT);
            //isTrue assignment to rerun from while
            isTrue = response.equals("y");
        }
    }
    public static void triangleMaker(int size, char fillChar) {
        for(int y = 0; y < size ; y++) {
            //Uses formatted text to print one less space character for every row of the triangle
            System.out.printf("%" + ((size - y) + 3) + "s", "");
            for(int x = 0; x <= y; x++) {
                //Prints character x amount of times for the xth row
                System.out.print(" " + fillChar );}
            //Prints a newline at the end of every row
            System.out.print(" \n");
        }
        //Prints a newline at the end of every triangle
        System.out.println("\n");
    }
}
