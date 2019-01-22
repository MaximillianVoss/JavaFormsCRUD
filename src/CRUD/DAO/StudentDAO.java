package CRUD.DAO;

import Common.Fields;
import Common.Tables;
import Models.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO extends DAO<Student> {
    @Override
    public void insert(Student adr) {

    }

    @Override
    public Student getById(int id) {
        return null;
    }

    @Override
    public void update(Student adr) {

    }

    @Override
    public void delete(Student adr) {

    }

    @Override
    public ArrayList<Student> getAll() {
        ArrayList<Student> res = new ArrayList<>();
        try {
            manager.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Connection con = manager.getCon();
        try (Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery("select * from " + Tables.students)
        ) {
            while (rs.next()) { //if rs.next() returns false
                res.add(new Student(
                        rs.getInt(Fields.id),
                        rs.getInt(Fields.idHuman),
                        rs.getInt(Fields.idOccupation),
                        rs.getInt(Fields.idDepartment),
                        rs.getInt(Fields.studyYear),
                        rs.getInt(Fields.idGroup)
                ));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
