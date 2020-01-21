package com.sanjiv.rest.webservice.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {

    private static ArrayList<User> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new User(1, "Sanjiv", new Date()));
        users.add(new User(2, "Rajeev", new Date()));
        users.add(new User(3, "Dileep", new Date()));

    }

    public List<User> findAll() {
        return users;
    }

    public User saveUser(User user) {

        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User deleteUser(int id) {
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()) {
            User user = iterator.next();
            if(user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }

}
