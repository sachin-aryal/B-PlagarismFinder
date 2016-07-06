import java.util.Scanner;

/**
 * Author: SACHIN
 * Date: 7/6/2016.
 */
public class StartApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first line");
        String firstLine = input.nextLine();
        System.out.println("Enter the second line");
        String secondLine = input.nextLine();
        double similarity = new WordProcessor().getSimilarity(firstLine,secondLine);
        System.out.println("Cosine similarity of Two Contents are: "+similarity);
    }
}
