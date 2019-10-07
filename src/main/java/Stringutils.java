import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Stringutils {
//    Create a new class with a main method that prompts the user for input and does the following (using the Stringutils class)

//    a. Tells whether or not what the user entered is a number
//    b. Flips the case of the string
//    c. Reverses the string
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter something");
    String userInput = input.nextLine();


    if(StringUtils.isNumeric(userInput)){
        System.out.println("This is a number!");
    } else {
        System.out.println("This is not a number!");
    }

    System.out.println("Flips the case of your input = " +StringUtils.swapCase(userInput));
    System.out.println("Your input Reversed = " +StringUtils.reverse(userInput));


//    this is why sout isnt working = should only used in main(String args[]){},the latest version of the Idea is OK.
//    System.out.println("Name: "+name);
    }
}
