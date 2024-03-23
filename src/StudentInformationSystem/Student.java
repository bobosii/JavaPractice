package StudentInformationSystem;

public class Student {
    String name;
    String studNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avg;
    boolean isPass;

    Student(String name, String studNo, String classes,Course c1,Course c2, Course c3){
        this.name = name;
        this.studNo = studNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avg = 0.0;
        int sozluNot = 0;
        this.isPass = false;
    }

    void addBulkExamNotes(int note1,int note2, int note3){
        if (note1 >= 0 && note1 <= 100){
            c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100){
            c3.note = note3;
        }
    }
    void sozluNotEkle(int sozlu1, int sozlu2, int sozlu3){
        if (sozlu1 >= 0 && sozlu1 <= 100){
            c1.sozluNot = sozlu1;
        }
        if (sozlu2 >= 0 && sozlu2 <= 100){
            c2.sozluNot = sozlu2;
        }
        if (sozlu3 >= 0 && sozlu3 <= 100){
            c3.sozluNot = sozlu3;
        }
    }
    void printNote(){
        System.out.println(c1.name + " Dersinizin notu : " + c1.note + " Sözlü notu ise : " + c1.sozluNot);
        System.out.println(c2.name + " Dersinizin notu : " + c2.note + " Sözlü notu ise : " + c2.sozluNot);
        System.out.println(c3.name + " Dersinizin notu : " + c3.note + " Sözlü notu ise : " + c3.sozluNot);
    }
    double calculateAvg(){
        avg = (((c1.note * 0.8) + (c1.sozluNot * 0.2)) + ((c2.note * 0.8) + (c2.sozluNot * 0.2)) + ((c3.note * 0.8) + (c3.sozluNot * 0.2))) / 3;
        return avg;
    }
    void isPass(){

        if (calculateAvg() > 55){
            isPass = true;
            System.out.println("---- Well Done ----");
        }else {
            isPass = false;
            System.out.println("We hope see to you in next semester :()");
        }
        printNote();
        System.out.println("Your average is : " + calculateAvg());
    }

}
