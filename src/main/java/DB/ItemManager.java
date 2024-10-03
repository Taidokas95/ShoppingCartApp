package DB;

import BO.Item;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public List<Item> getItems() {
        List<Item> items = new ArrayList<Item>();
        try (Connection conn = DBManager.getConnection()) {
            String query = "SELECT * FROM items";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                items.add(new Item(id, name, price));
            }
            return items;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
