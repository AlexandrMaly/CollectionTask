package UserAddList;

import java.util.ArrayList;

import User.User;

public class UserAddList {
    public ArrayList<User> getUser() {
        ArrayList<User> users = new ArrayList<>();
        User userOne = new User("Alex", "Alex@gmail.com");
        User userTwo = new User("Grisha", "Grisha@gmail.com");
        User userThree = new User("Roman", "Roman@gmail.com");
        User userFour = new User("Andriy", "Andriy@gmail.com");
        User userFive = new User("Vova", "Vova@gmail.com");

        users.add(userOne);
        users.add(userTwo);
        users.add(userThree);
        users.add(userFour);
        users.add(userFive);

        return users;
    }
}
