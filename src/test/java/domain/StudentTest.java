package domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class StudentTest {

    public static void main(String[] args) throws IOException {
        Address address = new Address();
        address.setFullAddress("Chitkara");

        Name name = new Name("a");
//        name.setFirstName("a");
        name.setMiddleName("b");
        name.setLastName("c");

        Gender gender = new Gender();
        gender.setVal("male");

        Student student = new Student(name);
        student.setAddress(address);
        student.setGender(gender);
//        student.setName(name);

        System.out.println(new ObjectMapper().writeValueAsString(student));

        student = new ObjectMapper().
                readValue("{\"name\":{\"firstName\":\"a\",\"middleName\":\"b\",\"lastName\":\"c\"}," +
                        "\"gender\":{\"val\":\"male\"}," +
                        "\"address\":{\"fullAddress\":\"Chitkara\"}}\n",
                        Student.class);
    }

}