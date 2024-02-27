package aggregation;

public class Author {
    private String name;
    private String emailId;
    private char gender;

    public Author(String name, String emailId, char gender) {
        this.name = name;
        this.emailId = emailId;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
