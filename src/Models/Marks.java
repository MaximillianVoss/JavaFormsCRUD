package Models;

import java.util.Date;

public class Marks {
    public int id;
    public int idStudent;
    public int idSubject;
    public int mark;
    public Date createDate;

    public Marks(int id, int idStudent, int idSubject, int mark, Date createDate) {
        this.id = id;
        this.idStudent = idStudent;
        this.idSubject = idSubject;
        this.mark = mark;
        this.createDate = createDate;
    }
}
