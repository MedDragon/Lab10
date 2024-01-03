package sumdu.edu.ua.mavenproject2.Repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sumdu.edu.ua.mavenproject2.model.Content;
import sumdu.edu.ua.mavenproject2.model.Student;
@Repository
public interface Repo_Content extends JpaRepository<Student, Integer>{
    @Query("from disciplines where student_id= :id")
    List<Content> getMarksByStId(@Param("id") int id);
}
