package CRUD.DAO;

import Common.Fields;
import Common.Tables;
import Models.Departments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DepartmentDAO extends DAO<Departments> {
    @Override
    public void insert(Departments adr) {

    }

    @Override
    public Departments getById(int id) {
        return null;
    }

    @Override
    public void update(Departments adr) {

    }

    @Override
    public void delete(Departments adr) {

    }

    @Override
    public ArrayList<Departments> getAll() {
        ArrayList<Departments> res = new ArrayList<>();
        try {
            manager.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Connection con = manager.getCon();
        try (Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery("select * from " + Tables.departments);
        ) {
            while (rs.next()) { //if rs.next() returns false
                res.add(new Departments(
                        rs.getInt(Fields.id),
                        rs.getString(Fields.title),
                        rs.getInt(Fields.idHuman)
                ));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
