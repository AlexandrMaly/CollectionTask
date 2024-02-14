package Output;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import User.User;

public class OutputUser {
    private Scanner sc = new Scanner(System.in);

    public void getUsersList(ArrayList<User> list) {
        int count = 0;
        for (User user : list) {
            count++;
            String output = count + ". " + user.getName() +
                    ", " + user.getEmail();
            System.out.println(output);
        }
        System.out.println("You have " + list.size() + " users");
    }

    public void getUserByIndex(ArrayList<User> list) {
        System.out.println("Enter the user index from 1 to " + list.size());
        try {
            int index = Integer.parseInt(sc.nextLine()) - 1;
            String output = index + 1 + ". " + list.get(index).getName() +
                    ", " + list.get(index).getEmail();
            System.out.println(output);
        } catch (NumberFormatException e) {
            System.out.println("Entered incorrect value");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The entered value is incorrect");
        }
    }

    public void getSortedUserList(ArrayList<User> list) {
        list.sort(Comparator.comparing(User::getName));
        int count = 0;
        for (User user : list) {
            count++;
            String output = count + ". " + user.getName() +
                    ", " + user.getEmail();
            System.out.println(output);
        }
    }

    public void getSortedUserByIndex(ArrayList<User> list) {
        System.out.println("Enter the user index from 1 to " + list.size());
        list.sort(Comparator.comparing(User::getName));
        try {
            int index = Integer.parseInt(sc.nextLine()) - 1;
            String output = index + 1 + ". " + list.get(index).getName() +
                    ", " + list.get(index).getEmail();
            System.out.println(output);
        } catch (NumberFormatException e) {
            System.out.println("Entered incorrect value");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The entered value is incorrect");
        }

    }

}
