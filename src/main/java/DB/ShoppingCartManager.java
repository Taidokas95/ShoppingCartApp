package DB;

import BO.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartManager {

    public static List<Item> getShoppingCart(String userId) {

        List<Item> items = new ArrayList<Item>();

        try (Connection conn = DBManager.getConnection()) {
            String query = "SELECT sc.itemId, i.itemName, i.price, sc.quantity " +
                    "FROM shoppingcart sc " +
                    "JOIN items i ON sc.itemId = i.id " +
                    "WHERE sc.userId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, userId); // Set the userId in the query
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int itemId = rs.getInt("itemId");
                String itemName = rs.getString("itemName");
                int itemPrice = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                items.add(new Item(itemId, itemName, itemPrice, quantity));
            }
            return items;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void addShoppingCart(String userId, int itemId) {
        try (Connection conn = DBManager.getConnection()) {
            String query = "INSERT INTO shoppingcart (userId, itemId, quantity) " +
                    "VALUES (?, ?, ?) " +
                    "ON DUPLICATE KEY UPDATE quantity = quantity + VALUES(quantity);";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, userId);
            ps.setInt(2, itemId);
            ps.setInt(3, 1);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Item successfully added to the cart.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
