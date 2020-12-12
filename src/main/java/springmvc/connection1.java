package springmvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection1 {
    public Connection connect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/inventoryy", "root", "");
        return con1;

    }
}
