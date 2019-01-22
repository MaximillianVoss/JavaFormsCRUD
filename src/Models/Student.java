package Models;

public class Student {
    public int id;
    public int idHuman;
    public int idOccupation;
    public int idDepartment;
    public int studyYear;
    public int idGroup;

    public Student(int id, int idHuman, int idOccupation,
                   int idDepartment, int studyYear, int idGroup) {
        this.id = id;
        this.idHuman = idHuman;
        this.idOccupation = idOccupation;
        this.idDepartment = idDepartment;
        this.studyYear = studyYear;
        this.idGroup = idGroup;
    }
}
