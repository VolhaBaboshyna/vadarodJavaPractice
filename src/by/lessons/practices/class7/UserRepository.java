package by.lessons.practices.class7;

import java.util.ArrayList;
import java.util.List;

public class UserRepository extends User {
    static List<User> users;

    public UserRepository(String login, String password, String name, String surname, List<User> users) {
        super(login, password, name, surname);
        UserRepository.users = users;
    }

    public UserRepository(List<User> users) {
        UserRepository.users = users;
    }

    public UserRepository() {

    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        UserRepository.users = users;
    }

    static {
        users = new ArrayList<>();
        users.add(new User("user1", "password1", "Kolya", "Kolechkin"));
        users.add(new User("user2", "password2", "Grisha", "Grishin"));
        users.add(new User("user3", "password3", "Lesha", "Leshin"));
        users.add(new User("user4", "password4", "Misha", "Mishin"));
        users.add(new User("user5", "password5", "Sasha", "Sashin"));
    }


}
