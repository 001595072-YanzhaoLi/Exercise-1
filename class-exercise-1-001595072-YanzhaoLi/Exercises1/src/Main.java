
public class Main {
    public static void main(String[] args) {
        Session a = new Session();
        short b = 1;
        Student s1 = new FullTime("s1", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s1);
        b++;
        Student s2 = new FullTime("s2", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s2);
        b++;
        Student s3 = new FullTime("s3", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s3);
        b++;
        Student s4 = new FullTime("s4", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s4);
        b++;
        Student s5 = new FullTime("s5", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s5);
        b++;
        Student s6 = new FullTime("s6", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s6);
        b++;
        Student s7 = new FullTime("s7", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s7);
        b++;
        Student s8 = new FullTime("s8", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s8);
        b++;
        Student s9 = new FullTime("s9", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s9);
        b++;
        Student s10 = new FullTime("s10", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s10);
        b++;
        Student s11 = new PartTime("s11", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s11);
        b++;
        Student s12 = new PartTime("s12", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s12);
        b++;
        Student s13 = new PartTime("s13", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s13);
        b++;
        Student s14 = new PartTime("s14", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s14);
        b++;
        Student s15 = new PartTime("s15", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s15);
        b++;
        Student s16 = new PartTime("s16", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s16);
        b++;
        Student s17 = new PartTime("s17", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s17);
        b++;
        Student s18 = new PartTime("s18", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s18);
        b++;
        Student s19 = new PartTime("s19", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s19);
        b++;
        Student s20 = new PartTime("s20", b, b, b, b, b, b, b, b, b, b, b, b, b, b, b);
        a.setStudents(s20);
        b++;
        System.out.println("calculate average quiz scores per student for the whole class");
        a.printAverage();
        System.out.println("print the list of quiz scores in ascending order for one session");
        a.printAll();
        System.out.println("print names of part-time students");
        a.printAllPartTime();
        System.out.println("print exam scores of full-time students");
        a.printAllExam();
    }


}
