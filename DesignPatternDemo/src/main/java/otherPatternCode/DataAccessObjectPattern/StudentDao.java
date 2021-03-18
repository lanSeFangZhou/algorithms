package otherPatternCode.DataAccessObjectPattern;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudsents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
