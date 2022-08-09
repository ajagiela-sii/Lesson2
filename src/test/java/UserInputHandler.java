import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {
    public static int getIntFromUser() {
        try {
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        } catch (InputMismatchException exception) {
            return -1;
        }
    }
}
