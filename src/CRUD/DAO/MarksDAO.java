package CRUD.DAO;

import Common.Fields;
import Common.Tables;
import Models.Marks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MarksDAO extends DAO<Marks> {
    @Override
    public void insert(Marks adr) {

    }

    @Override
    public Marks getById(int id) {
        return null;
    }

    @Override
    public void update(Marks adr) {

    }

    @Override
    public void delete(Marks adr) {

    }

    @Override
    public ArrayList<Marks> getAll() {
        ArrayList<Marks> res = new ArrayList<>();
        try {
            manager.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Connection con = manager.getCon();
        try (Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery("select * from " + Tables.marks)
        ) {
            while (rs.next()) { //if rs.next() returns false
                res.add(new Marks(
                        rs.getInt(Fields.id),
                        rs.getInt(Fields.idStudent),
                        rs.getInt(Fields.idSubject),
                        rs.getInt(Fields.mark),
                        rs.getDate(Fields.createDate)
                ));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
