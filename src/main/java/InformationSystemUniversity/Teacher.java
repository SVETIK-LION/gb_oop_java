package InformationSystemUniversity;


public class Teacher extends Person{
    private String universitySubject;

    public Teacher() {
    }

    public Teacher(String id, String name, String age, String universitySubject) {
        super(id, name, age);
        this.universitySubject = universitySubject;
    }

    public String getUniversitySubject(){return universitySubject;}

    public void setUniversitySubject(String universitySubject) {
        this.universitySubject = universitySubject;
    }
}
