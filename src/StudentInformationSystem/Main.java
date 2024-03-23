package StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut","0101","TRH");
        Teacher t2 = new Teacher("Emirhan","531","FZK");
        Teacher t3 = new Teacher("Hasan","3131","BIO");
        Course Tarih = new Course("Tarih","101","TRH");
        Course Fizik = new Course("Fizik","102","FZK");
        Course Bio = new Course("Biyoloji","103","BIO");
        Fizik.addTeacher(t2);
        Tarih.addTeacher(t1);
        Bio.addTeacher(t3);
        Student s1 = new Student("Emir","1024","2",Tarih,Fizik,Bio);
        s1.addBulkExamNotes(55,50,61);
        s1.sozluNotEkle(100,60,30);
        s1.isPass();

    }
}
