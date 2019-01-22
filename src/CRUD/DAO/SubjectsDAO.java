package CRUD.DAO;

import Common.Fields;
import Common.Tables;
import Models.Subjects;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SubjectsDAO extends DAO<Subjects> {

    @Override
    public void insert(Subjects adr) {

    }

    @Override
    public Subjects getById(int id) {
        return null;
    }

    @Override
    public void update(Subjects adr) {

    }

    @Override
    public void delete(Subjects adr) {

    }

    @Override
    public ArrayList<Subjects> getAll() {
        ArrayList<Subjects> res = new ArrayList<>();
        try {
            manager.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Connection con = manager.getCon();
        try (Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery("select * from " + Tables.subjects)
        ) {
            while (rs.next()) { //if rs.next() returns false
                res.add(new Subjects(
                        rs.getInt(Fields.id),
                        rs.getString(Fields.title),
                        rs.getInt(Fields.idHuman
                        )
                ));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
