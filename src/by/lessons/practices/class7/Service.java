package by.lessons.practices.class7;

import java.util.ArrayList;
import java.util.List;

public class Service {
    void authenticate(String login, String password) {
        List<User> users = UserRepository.users;
        List<String> logins = new ArrayList<>();
        for (User u : users) {
            logins.add(u.getLogin());
        }
        for (String l : logins) {
            if (!logins.contains(login)) {
                throw new UserNotFoundException();
            }
        }
    }
}
