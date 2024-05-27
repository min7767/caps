package items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Items_tab_pad_DAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/yourdatabase";
    private String jdbcUsername = "yourusername";
    private String jdbcPassword = "yourpassword";

    private static final String INSERT_ITEMS_SQL = "INSERT INTO items_tab_pad (T_P_ID, T_P_Class, T_P_Qua, T_P_Purchase, T_P_Monthly, T_P_Brand, T_P_Model, T_P_Color, T_P_Memory, T_P_Photo, user_Email, user_Name) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_ITEM_BY_ID = "SELECT T_P_ID, T_P_Class, T_P_Qua, T_P_Purchase, T_P_Monthly, T_P_Brand, T_P_Model, T_P_Color, T_P_Memory, T_P_Photo, user_Email, user_Name FROM items_tab_pad WHERE T_P_ID =?";
    private static final String SELECT_ALL_ITEMS = "SELECT * FROM items_tab_pad";
    private static final String DELETE_ITEMS_SQL = "DELETE FROM items_tab_pad WHERE T_P_ID = ?;";
    private static final String UPDATE_ITEMS_SQL = "UPDATE items_tab_pad SET T_P_Class = ?, T_P_Qua= ?, T_P_Purchase =?, T_P_Monthly =?, T_P_Brand =?, T_P_Model =?, T_P_Color =?, T_P_Memory =?, T_P_Photo =?, user_Email =?, user_Name =? WHERE T_P_ID = ?;";

    public Items_tab_pad_DAO() {}

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void insertItem(Items_tab_pad item) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ITEMS_SQL)) {
            preparedStatement.setInt(1, item.getT_P_ID());
            preparedStatement.setString(2, item.getT_P_Class());
            preparedStatement.setInt(3, item.getT_P_Qua());
            preparedStatement.setInt(4, item.getT_P_Purchase());
            preparedStatement.setInt(5, item.getT_P_Monthly());
            preparedStatement.setString(6, item.getT_P_Brand());
            preparedStatement.setString(7, item.getT_P_Model());
            preparedStatement.setString(8, item.getT_P_Color());
            preparedStatement.setString(9, item.getT_P_Memory());
            preparedStatement.setString(10, item.getT_P_Photo());
            preparedStatement.setString(11, item.getUser_Email()); // 변경된 필드
            preparedStatement.setString(12, item.getUser_Name()); // 추가된 필드
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public Items_tab_pad selectItem(int id) {
        Items_tab_pad item = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ITEM_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String T_P_Class = rs.getString("T_P_Class");
                int T_P_Qua = rs.getInt("T_P_Qua");
                int T_P_Purchase = rs.getInt("T_P_Purchase");
                int T_P_Monthly = rs.getInt("T_P_Monthly");
                String T_P_Brand = rs.getString("T_P_Brand");
                String T_P_Model = rs.getString("T_P_Model");
                String T_P_Color = rs.getString("T_P_Color");
                String T_P_Memory = rs.getString("T_P_Memory");
                String T_P_Photo = rs.getString("T_P_Photo");
                String user_Email = rs.getString("user_Email"); // 변경된 필드
                String user_Name = rs.getString("user_Name"); // 추가된 필드
                item = new Items_tab_pad();
                item.setT_P_ID(id);
                item.setT_P_Class(T_P_Class);
                item.setT_P_Qua(T_P_Qua);
                item.setT_P_Purchase(T_P_Purchase);
                item.setT_P_Monthly(T_P_Monthly);
                item.setT_P_Brand(T_P_Brand);
                item.setT_P_Model(T_P_Model);
                item.setT_P_Color(T_P_Color);
                item.setT_P_Memory(T_P_Memory);
                item.setT_P_Photo(T_P_Photo);
                item.setUser_Email(user_Email); // 변경된 필드
                item.setUser_Name(user_Name); // 추가된 필드
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return item;
    }

    public List<Items_tab_pad> selectAllItems() {
        List<Items_tab_pad> items = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ITEMS)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int T_P_ID = rs.getInt("T_P_ID");
                String T_P_Class = rs.getString("T_P_Class");
                int T_P_Qua = rs.getInt("T_P_Qua");
                int T_P_Purchase = rs.getInt("T_P_Purchase");
                int T_P_Monthly = rs.getInt("T_P_Monthly");
                String T_P_Brand = rs.getString("T_P_Brand");
                String T_P_Model = rs.getString("T_P_Model");
                String T_P_Color = rs.getString("T_P_Color");
                String T_P_Memory = rs.getString("T_P_Memory");
                String T_P_Photo = rs.getString("T_P_Photo");
                String user_Email = rs.getString("user_Email"); // 변경된 필드
                String user_Name = rs.getString("user_Name"); // 추가된 필드
                Items_tab_pad item = new Items_tab_pad();
                item.setT_P_ID(T_P_ID);
                item.setT_P_Class(T_P_Class);
                item.setT_P_Qua(T_P_Qua);
                item.setT_P_Purchase(T_P_Purchase);
                item.setT_P_Monthly(T_P_Monthly);
                item.setT_P_Brand(T_P_Brand);
                item.setT_P_Model(T_P_Model);
                item.setT_P_Color(T_P_Color);
                item.setT_P_Memory(T_P_Memory);
                item.setT_P_Photo(T_P_Photo);
                item.setUser_Email(user_Email); // 변경된 필드
                item.setUser_Name(user_Name); // 추가된 필드
                items.add(item);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return items;
    }

    public boolean deleteItem(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_ITEMS_SQL)) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    public boolean updateItem(Items_tab_pad item) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_ITEMS_SQL)) {
            statement.setString(1, item.getT_P_Class());
            statement.setInt(2, item.getT_P_Qua());
            statement.setInt(3, item.getT_P_Purchase());
            statement.setInt(4, item.getT_P_Monthly());
            statement.setString(5, item.getT_P_Brand());
            statement.setString(6, item.getT_P_Model());
            statement.setString(7, item.getT_P_Color());
            statement.setString(8, item.getT_P_Memory());
            statement.setString(9, item.getT_P_Photo());
            statement.setString(10, item.getUser_Email()); // 변경된 필드
            statement.setString(11, item.getUser_Name()); // 추가된 필드
            statement.setInt(12, item.getT_P_ID());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
