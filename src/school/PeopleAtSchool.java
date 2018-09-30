package school;

public class PeopleAtSchool {
    private String firstName;
    private String lastName;

    public PeopleAtSchool(){}

    public PeopleAtSchool(String firstName, String lastNem) {
        this.firstName = firstName;
        this.lastName = lastNem;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastNem(String lastNem) {
        this.lastName = lastNem;
    }

    public void showInfo(){
        System.out.print(firstName+" "+lastName);
    }
}
