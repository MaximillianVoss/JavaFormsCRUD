package CRUD.DAO;

import Common.Fields;
import Common.Tables;
import Models.Ocupations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OcupationsDAO extends DAO<Ocupations> {
    @Override
    public void insert(Ocupations adr) {

    }

    @Override
    public Ocupations getById(int id) {
        return null;
    }

    @Override
    public void update(Ocupations adr) {

    }

    @Override
    public void delete(Ocupations adr) {

    }

    @Override
    public ArrayList<Ocupations> getAll() {
        ArrayList<Ocupations> res = new ArrayList<>();
        try {
            manager.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Connection con = manager.getCon();
        try (Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery("select * from " + Tables.ocupations)
        ) {
            while (rs.next()) { //if rs.next() returns false
                res.add(new Ocupations(
                        rs.getInt(Fields.id),
                        rs.getString(Fields.title)
                ));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
