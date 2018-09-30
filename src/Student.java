public class Student extends PeopleAtSchool{
    private String firstName;
    private String lastName;
    private int classYear;
    private int yearBirth;
    private double gradeAverage;

    public Student(String firstName, String lastNem, int classYear, int yearBirth, double gradeAverage) {
        super(firstName, lastNem);
        this.classYear = classYear;
        this.yearBirth = yearBirth;
        this.gradeAverage = gradeAverage;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(double gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    public void showInfo(){
        System.out.print("Student: ");
        super.showInfo();
        System.out.println(" "+classYear+" "+gradeAverage+" "+yearBirth);
    }
}
