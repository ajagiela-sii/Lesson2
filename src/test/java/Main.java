import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("-------Generate your token-------");
        System.out.println("Enter token length (available lengths 5,10,15) : ");

        int tokenLength = UserInputHandler.getIntFromUser();
        String token = tokenGenerator(tokenLength);
        if (token.isEmpty()) {
            System.out.println("Wrong token length! The available lengths are: 5, 10, 15");
        } else {
            System.out.println("Your token is: " + token);
        }

    }

    private static String tokenGenerator(int tokenLength) {
        switch (tokenLength) {
            case 5, 10, 15:
                char[] token = new char[tokenLength];
                Random r = new Random();
                for (int i = 0; i < tokenLength; i++) {
                    token[i] = (char) r.nextInt(33, 127);
                }
                return String.valueOf(token);
            default:
                return "";
        }
    }
}
