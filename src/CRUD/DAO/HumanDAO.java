package CRUD.DAO;

import Common.Fields;
import Common.Tables;
import Models.Human;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HumanDAO extends DAO<Human> {

    @Override
    public void insert(Human adr) {

    }

    @Override
    public Human getById(int id) {
        return null;
    }

    @Override
    public void update(Human adr) {

    }

    @Override
    public void delete(Human adr) {

    }

    @Override
    public ArrayList<Human> getAll() {
        ArrayList<Human> res = new ArrayList<>();
        try {
            manager.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Connection con = manager.getCon();
        try (Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery("select * from " + Tables.humans)
        ) {
            while (rs.next()) { //if rs.next() returns false
                res.add(new Human(
                        rs.getInt(Fields.id),
                        rs.getString(Fields.firstName),
                        rs.getString(Fields.middleName),
                        rs.getString(Fields.lastName),
                        rs.getInt(Fields.age)
                ));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }


}
