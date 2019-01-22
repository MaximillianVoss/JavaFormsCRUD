package CRUD.Services;

import CRUD.DAO.TableDAO;

import java.sql.ResultSet;
import java.util.ArrayList;

public class TableService {
    public TableService() {

    }

    public Object GetRowById(String tableName, int id) {
        return null;
    }

    public Object[] GetAllRows(String tableName) {
        TableDAO tableDAO = new TableDAO();
        return tableDAO.GetAllRows(tableName);
    }
}
