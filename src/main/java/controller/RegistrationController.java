package controller;

import domain.Name;
import domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegistrationController.class);

    @GetMapping(path = "/{batch}", produces = "application/json")
    public int register(@RequestParam(name = "firstName") String firstName,
                           @RequestParam(name = "middleName", required = false) String middleName,
                           @RequestParam(name = "lastName", required = false) String lastName,
                           @RequestParam(name = "gender", required = false) String gender,
                           @RequestParam(name = "dob") String dob,
                           @RequestParam(name = "address") String address,
                           @RequestParam(name = "contact") String contact,
                           @PathVariable ("batch") int batch) {

        LOGGER.info("register service hit!!");
        return -1;
    }


    @PostMapping(path = "/post", produces = "application/json")
    public int register(@RequestBody Student student) {
        LOGGER.info("Post registration service hit!!");
        return -1;
    }

    @GetMapping(path = "/list")
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(new Name("Sandeep")));
        students.add(new Student(new Name("Raj")));
        students.add(new Student(new Name("Gaurav")));
        students.add(new Student(new Name("Dhiraj")));

        return students;
    }


    @PostMapping("section")
    public int assignSection(@RequestBody AssignSection assignSection) {
        LOGGER.info("rollno: " + assignSection.getRollNo() + "\n section: "
                + assignSection.getSection() );
        return assignSection.getSection();
    }
}


