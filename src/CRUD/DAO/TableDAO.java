package CRUD.DAO;

import Common.Tables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TableDAO extends DAO<String> {

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
        return null;
    }

    public Object[] GetAllRows(String tableName) {
        tableName = String.format("[dbo].[%s]", tableName);
        if (tableName.equals(Tables.humans))
            return new HumanDAO().getAll().toArray();
        if (tableName.equals(Tables.marks))
            return new MarksDAO().getAll().toArray();
        if (tableName.equals(Tables.ocupations))
            return new OcupationsDAO().getAll().toArray();
        if (tableName.equals(Tables.students))
            return new StudentDAO().getAll().toArray();
        if (tableName.equals(Tables.subjects))
            return new SubjectsDAO().getAll().toArray();
        if (tableName.equals(Tables.departments))
            return new DepartmentDAO().getAll().toArray();
        return new Object[0];
    }
}
