package domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Name {

    private String firstName;
    private String middleName;
    private String lastName;

    public Name(@JsonProperty("firstName") String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }


//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
