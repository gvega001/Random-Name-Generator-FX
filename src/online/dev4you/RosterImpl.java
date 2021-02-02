package online.dev4you;

import java.util.ArrayList;

public class RosterImpl implements Roster {

    //******====  Fields     =====*****
    private ArrayList<Student> studentArrayList= new ArrayList<>();
    public Student student = new Student();

    //******====  Public Methods =====****
    @Override
    public ArrayList<Student> studentRoster() {

        return studentArrayList;
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    private void addStudentToArrayList(Student student) {
        this.studentArrayList.add(student);
    }
    private void deleteStudentToArrayList(Student student) {
        this.studentArrayList.remove(student);
    }

}
