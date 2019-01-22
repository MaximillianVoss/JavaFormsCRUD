package CRUD.DAO;

import java.util.ArrayList;

public abstract class DAO<T> {
    public DAOManager manager = new DAOManager();
    public abstract void insert(T adr);
    public abstract T getById(int id);
    public abstract void update(T adr);
    public abstract void delete(T adr);
    public abstract ArrayList<T> getAll();
}
