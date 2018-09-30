public class Teacher extends  PeopleAtSchool{
    //private String firstName;
    //private String lastName;
    private String faculty;
    private int workExperience;
    private double salary;

    public Teacher(String firstName, String lastNem, String faculty, int workExperience, double salary) {
        super(firstName, lastNem);
        this.faculty = faculty;
        this.workExperience = workExperience;
        this.salary = salary;
    }

    /*public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }*/

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInfo(){
        System.out.print("Teacher: ");
        super.showInfo();
        System.out.println(" "+faculty+" "+workExperience+" "+salary);
    }
}
