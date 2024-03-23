package StudentInformationSystem;

public class Teacher {
    String name;
    String  mpno;
    String branch;

    public Teacher(String name, String  mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    void printInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
        System.out.println("Mobil Phone No : " + this.mpno);
    }
}
