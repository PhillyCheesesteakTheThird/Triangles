import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        char fillChar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the side-length of your equilateral triangle?");
        size = scanner.nextInt();

        System.out.println("What fill character would you like for your triangles?");
        String nothing = scanner.nextLine();
        fillChar = scanner.nextLine().charAt(0);
        System.out.println("Here's your triangle: ");
        triangleMaker(size, fillChar);

    }
    public static void triangleMaker(int size, char fillChar) {
        if ((size > 50) || (size < 1)) {
            System.out.println("I'm sorry your side-length is outside of my range (1-50). Please submit again:");
        }
        else{
            for(int y = 0; y < size ; y++) {
                System.out.printf("%"+((size-y) + 3)+"s", "   ");
                for(int x = 0; x <= y; x++) {
                    System.out.print(" "+fillChar );}
                System.out.print(" \n");
            }
        }
    }
}