package dao;

import domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


// In-memory storage of registered student with roll numbers assigned
@Repository
public class Register {

	private static Integer rollNumber = 0;

	private static final Logger LOGGER = LoggerFactory.getLogger(Register.class);

	// Roll number, Student
	private final Map<Integer, Student> map = new HashMap<Integer, Student>();

	public synchronized int addStudent(Student student) {
		rollNumber = rollNumber + 1;
		map.put(rollNumber, student);
		LOGGER.info("student : " + student.getName().getFirstName() + "\t rollnumber: " + rollNumber);
		return rollNumber;
	}

	public int getStudentCount() {
		return map.size();
	}

	public Student getStudent(int rollNumber) {
		return map.get(rollNumber);
	}

	public Map<Integer, Student> getAllStudents() {
		return map;
	}
}
