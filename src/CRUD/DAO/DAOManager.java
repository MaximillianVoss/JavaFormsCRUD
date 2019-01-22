package CRUD.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOManager {
    private Connection con;
    private String url = "jdbc:sqlserver://DESKTOP-OFGEK9Q\\SQLEXPRESS;databaseName=Hogvarts;integratedSecurity=true";

    public DAOManager() {
    }

    public Connection getCon() {
        return this.con;
    }

    public void open() throws SQLException {
        try {
            if (this.con == null || this.con.isClosed()) {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                this.con = DriverManager.getConnection(url);
            }
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void close() throws SQLException {
        try {
            if (this.con != null && !this.con.isClosed())
                this.con.close();
        } catch (SQLException e) {
            throw e;
        }
    }


}
