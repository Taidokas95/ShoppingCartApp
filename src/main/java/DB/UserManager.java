package DB;

import BO.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserManager {

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        try (Connection conn = DBManager.getConnection()) {
            String query = "SELECT * FROM userinfo";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                users.add(new User(id, name));
            }
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
