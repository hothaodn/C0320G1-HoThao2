package models;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> userList;
    static {
        userList = new ArrayList<>();
        userList.add(new User("john","123456","John","j@gmail.com",18));
        userList.add(new User("bob","123","Bob","bob@gmail.com",23));
        userList.add(new User("annie","123456","Annie","an@gmail.com",23));
        userList.add(new User("lily","123456","Lily","ly@gmail.com",19));
        userList.add(new User("rosie","123456","Rosie","ro@gmail.com",18));
    }
    public static User checkLogin(Login login){
        for(User user : userList){
            if(user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
