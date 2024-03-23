package StudentInformationSystem;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int sozluNot = 0;
    Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;

    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Teacher and course prefix does not exist");
        }

    }
    void printTeacher(){
        this.teacher.printInfo();

    }


}
