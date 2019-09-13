package domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

    private Name name;
    private Gender gender;
    private Address address;

    public Student(@JsonProperty("name") Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

//    public void setName(Name name) {
//        this.name = name;
//    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
