package Main;

import CRUD.DAO.HumanDAO;
import Forms.MainMenu;

public class Main {
    public static void main(String args[]) {
        try {
            MainMenu menu = new MainMenu();

            HumanDAO humans = new HumanDAO();
            humans.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
