package BO;

import DB.UserManager;
import UIControllers.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class UserHandler {

    public List<UserInfo> getUser() {
        List<User> users = UserManager.getUsers();
        List<UserInfo> userInfos = new ArrayList<>();
        for (User user : users) {
            userInfos.add(new UserInfo(user.getId(),user.getName()));
        }
        return userInfos;
    }

    public static UserInfo authenticateUser(String username, String password) {
        User user = UserManager.authenticateUser(username,password);
        return new UserInfo(user.getId(),user.getName());
    }
}
