package sumdu.edu.ua.mavenproject2.Repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sumdu.edu.ua.mavenproject2.model.Student;
@Repository
public interface Repo_Student extends JpaRepository<Student, Integer>{
    
    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Integer studentId);

    Student updateStudent(Student student);

    public Student getOne(int parseInt);

    public void deleteById(Integer StudentId);

    public Student save(Student student);

    public Object findById(Integer StudentId);
}
