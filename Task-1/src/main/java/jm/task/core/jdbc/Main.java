package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserService service = new UserServiceImpl();

        service.createUsersTable();

        service.saveUser("Виктор", "Иванов", (byte) 25);
        service.saveUser("Андрей", "Михальченков", (byte) 16);
        service.saveUser("Артем", "Молодченко", (byte) 37);
        service.saveUser("Тихон", "Титенков", (byte) 52);

        List<User> userList = service.getAllUsers();
        userList.forEach(System.out::println);

//        service.cleanUsersTable();
//
//        service.dropUsersTable();
    }
}
