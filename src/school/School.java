package school;

public class School {
    public static void main(String[] args) {


       Teacher teacher1=new Teacher("Anna","Nowak","Math",10,3456.89);
       teacher1.showInfo();

       Student student1=new Student("Jan","Kowalik",4,2010,4.57);
       student1.showInfo();

       /* Wersja bez dziedziczenia
       school.Teacher teacher1=new school.Teacher();
        teacher1.setFirstName("Anna");
        teacher1.setLastName("Nowak");
        teacher1.setFaculty("Mathematics");
        teacher1.setWorkExperience(10);
        teacher1.setSalary(3456.89);

        teacher1.showInfo();

        school.Student student1=new school.Student();
        student1.setFirstName("Jan");
        student1.setLastName("Kowalik");
        student1.setClassYear(4);
        student1.setYearBirth(2010);
        student1.setGradeAverage(4.57);

        student1.showInfo();*/

    }
}
