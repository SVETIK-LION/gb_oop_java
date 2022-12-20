package InformationSystemUniversity;


public class Student extends Person {
    private String speciality;

    public Student() {
    }

    public Student(String id, String name, String age, String speciality) {
        super(id, name, age);
        this.speciality = speciality;

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
