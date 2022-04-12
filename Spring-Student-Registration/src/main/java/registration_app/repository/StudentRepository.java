package registration_app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import registration_app.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	Student getByName(String name);

	Student findByName(String name);
}


