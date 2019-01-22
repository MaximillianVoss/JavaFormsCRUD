package CRUD.DAO;

import Common.Fields;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TablesDAO extends DAO<String> {

    @Override
    public void insert(String adr) {

    }

    @Override
    public String getById(int id) {
        return null;
    }

    @Override
    public void update(String adr) {

    }

    @Override
    public void delete(String adr) {

    }

    @Override
    public ArrayList<String> getAll() {
        ArrayList<String> res = new ArrayList<>();
        try {
            manager.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Connection con = manager.getCon();
        try (Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery("SELECT " + Fields.tableName + " FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE='BASE TABLE'")
        ) {
            while (rs.next()) {
                res.add(rs.getString(Fields.tableName));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
