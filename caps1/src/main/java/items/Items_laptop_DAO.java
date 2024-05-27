package items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Items_laptop_DAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/yourdatabase";
    private String jdbcUsername = "yourusername";
    private String jdbcPassword = "yourpassword";

    // CRUD 작업을 위한 SQL 쿼리
    private static final String INSERT_ITEMS_SQL = "INSERT INTO items_labtop (Labtop_ID, Labtop_Class, Labtop_Qua, Labtop_Purchase, Labtop_Monthly, Labtop_Brand, Labtop_Model, Labtop_Color, Labtop_Graphic, Labtop_OS, Laptop_CPU, Labtop_Memory, Labtop_Photo, user_Email, user_Name) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_ITEM_BY_ID = "SELECT Labtop_ID, Labtop_Class, Labtop_Qua, Labtop_Purchase, Labtop_Monthly, Labtop_Brand, Labtop_Model, Labtop_Color, Labtop_Graphic, Labtop_OS, Laptop_CPU, Labtop_Memory, Labtop_Photo, user_Email, user_Name FROM items_labtop WHERE Labtop_ID =?";
    private static final String SELECT_ALL_ITEMS = "SELECT * FROM items_labtop";
    private static final String DELETE_ITEMS_SQL = "DELETE FROM items_labtop WHERE Labtop_ID = ?;";
    private static final String UPDATE_ITEMS_SQL = "UPDATE items_labtop SET Labtop_Class = ?, Labtop_Qua = ?, Labtop_Purchase = ?, Labtop_Monthly = ?, Labtop_Brand = ?, Labtop_Model = ?, Labtop_Color = ?, Labtop_Graphic = ?, Labtop_OS = ?, Laptop_CPU = ?, Labtop_Memory = ?, Labtop_Photo = ?, user_Email = ?, user_Name = ? WHERE Labtop_ID = ?;";

    // 기본 생성자
    public Items_laptop_DAO() {}

    // 데이터베이스와 연결을 설정하는 메소드
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

    // 새로운 노트북 아이템을 데이터베이스에 추가하는 메소드
    public void insertItem(Items_labtop item) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ITEMS_SQL)) {
            preparedStatement.setInt(1, item.getLabtop_ID());
            preparedStatement.setString(2, item.getLabtop_Class());
            preparedStatement.setInt(3, item.getLabtop_Qua());
            preparedStatement.setInt(4, item.getLabtop_Purchase());
            preparedStatement.setInt(5, item.getLabtop_Monthly());
            preparedStatement.setString(6, item.getLabtop_Brand());
            preparedStatement.setString(7, item.getLabtop_Model());
            preparedStatement.setString(8, item.getLabtop_Color());
            preparedStatement.setString(9, item.getLabtop_Graphic());
            preparedStatement.setString(10, item.getLabtop_OS());
            preparedStatement.setString(11, item.getLaptop_CPU());
            preparedStatement.setString(12, item.getLabtop_Memory());
            preparedStatement.setString(13, item.getLabtop_Photo());
            preparedStatement.setString(14, item.getUser_Email());
            preparedStatement.setString(15, item.getUser_Name());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    // ID로 노트북 아이템을 조회하는 메소드
    public Items_labtop selectItem(int id) {
        Items_labtop item = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ITEM_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String Labtop_Class = rs.getString("Labtop_Class");
                int Labtop_Qua = rs.getInt("Labtop_Qua");
                int Labtop_Purchase = rs.getInt("Labtop_Purchase");
                int Labtop_Monthly = rs.getInt("Labtop_Monthly");
                String Labtop_Brand = rs.getString("Labtop_Brand");
                String Labtop_Model = rs.getString("Labtop_Model");
                String Labtop_Color = rs.getString("Labtop_Color");
                String Labtop_Graphic = rs.getString("Labtop_Graphic");
                String Labtop_OS = rs.getString("Labtop_OS");
                String Laptop_CPU = rs.getString("Laptop_CPU");
                String Labtop_Memory = rs.getString("Labtop_Memory");
                String Labtop_Photo = rs.getString("Labtop_Photo");
                String user_Email = rs.getString("user_Email");
                String user_Name = rs.getString("user_Name");
                item = new Items_labtop();
                item.setLabtop_ID(id);
                item.setLabtop_Class(Labtop_Class);
                item.setLabtop_Qua(Labtop_Qua);
                item.setLabtop_Purchase(Labtop_Purchase);
                item.setLabtop_Monthly(Labtop_Monthly);
                item.setLabtop_Brand(Labtop_Brand);
                item.setLabtop_Model(Labtop_Model);
                item.setLabtop_Color(Labtop_Color);
                item.setLabtop_Graphic(Labtop_Graphic);
                item.setLabtop_OS(Labtop_OS);
                item.setLaptop_CPU(Laptop_CPU);
                item.setLabtop_Memory(Labtop_Memory);
                item.setLabtop_Photo(Labtop_Photo);
                item.setUser_Email(user_Email);
                item.setUser_Name(user_Name);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return item;
    }

    // 모든 노트북 아이템을 조회하는 메소드
    public List<Items_labtop> selectAllItems() {
        List<Items_labtop> items = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ITEMS)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int Labtop_ID = rs.getInt("Labtop_ID");
                String Labtop_Class = rs.getString("Labtop_Class");
                int Labtop_Qua = rs.getInt("Labtop_Qua");
                int Labtop_Purchase = rs.getInt("Labtop_Purchase");
                int Labtop_Monthly = rs.getInt("Labtop_Monthly");
                String Labtop_Brand = rs.getString("Labtop_Brand");
                String Labtop_Model = rs.getString("Labtop_Model");
                String Labtop_Color = rs.getString("Labtop_Color");
                String Labtop_Graphic = rs.getString("Labtop_Graphic");
                String Labtop_OS = rs.getString("Labtop_OS");
                String Laptop_CPU = rs.getString("Laptop_CPU");
                String Labtop_Memory = rs.getString("Labtop_Memory");
                String Labtop_Photo = rs.getString("Labtop_Photo");
                String user_Email = rs.getString("user_Email");
                String user_Name = rs.getString("user_Name");
                Items_labtop item = new Items_labtop();
                item.setLabtop_ID(Labtop_ID);
                item.setLabtop_Class(Labtop_Class);
                item.setLabtop_Qua(Labtop_Qua);
                item.setLabtop_Purchase(Labtop_Purchase);
                item.setLabtop_Monthly(Labtop_Monthly);
                item.setLabtop_Brand(Labtop_Brand);
                item.setLabtop_Model(Labtop_Model);
                item.setLabtop_Color(Labtop_Color);
                item.setLabtop_Graphic(Labtop_Graphic);
                item.setLabtop_OS(Labtop_OS);
                item.setLaptop_CPU(Laptop_CPU);
                item.setLabtop_Memory(Labtop_Memory);
                item.setLabtop_Photo(Labtop_Photo);
                item.setUser_Email(user_Email);
                item.setUser_Name(user_Name);
                items.add(item);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return items;
    }

    // ID로 노트북 아이템을 삭제하는 메소드
    public boolean deleteItem(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_ITEMS_SQL)) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    // 기존 노트북 아이템을 업데이트하는 메소드
    public boolean updateItem(Items_labtop item) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_ITEMS_SQL)) {
            statement.setString(1, item.getLabtop_Class());
            statement.setInt(2, item.getLabtop_Qua());
            statement.setInt(3, item.getLabtop_Purchase());
            statement.setInt(4, item.getLabtop_Monthly());
            statement.setString(5, item.getLabtop_Brand());
            statement.setString(6, item.getLabtop_Model());
            statement.setString(7, item.getLabtop_Color());
            statement.setString(8, item.getLabtop_Graphic());
            statement.setString(9, item.getLabtop_OS());
            statement.setString(10, item.getLaptop_CPU());
            statement.setString(11, item.getLabtop_Memory());
            statement.setString(12, item.getLabtop_Photo());
            statement.setString(13, item.getUser_Email());
            statement.setString(14, item.getUser_Name());
            statement.setInt(15, item.getLabtop_ID());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    // SQL 예외를 출력하는 메소드
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
