package App;

import Output.OutputUser;
import UserAddList.UserAddList;

import java.util.Scanner;

public class App {
    private static OutputUser outputUser = new OutputUser();
    private static UserAddList userAddList = new UserAddList();
    private static Scanner sc = new Scanner(System.in);
    private static boolean continueWorking = true;

    public static void appStart() {
        while (continueWorking) {
            System.out.println("_____________________");
            displayMenu();
            try {
                int option = Integer.parseInt(sc.nextLine());
                switch (option) {
                    case 1 -> outputUser.getUsersList(userAddList.getUser());
                    case 2 -> outputUser.getUserByIndex(userAddList.getUser());
                    case 3 -> outputUser.getSortedUserList(userAddList.getUser());
                    case 4 -> outputUser.getSortedUserByIndex(userAddList.getUser());
                    case 5 -> {
                        System.out.println("Have a good day!");
                        continueWorking = false;
                    }
                    default -> System.out.println("Enter correct number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Exception " + e.getMessage());
            }
        }
        sc.close();
    }

    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Get user list");
        System.out.println("2. Get user by index");
        System.out.println("3. Get user by sorted name");
        System.out.println("4. Get user by index in sorted list");
        System.out.println("5. Exit");
        System.out.print("Enter number: ");
    }

}
