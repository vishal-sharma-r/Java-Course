class Subject {
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subId, String name, int maxMarks) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubId() {
        return subId;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }

    boolean isQualified(int n) {
        return n >= maxMarks / 10 * 4;
    }

    public String toString() {
        return "\nSubject ID:" + subId + "\nName : " + name + "\n maxMarks : " + maxMarks;

    }
}

class Student {
    private String rollNo;
    private String name;
    private String dept;
    private int numOfSub;
    private Subject sub[];

    public Student(String roll, String name) {
        this.rollNo = roll;
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;

    }

    public String getDept() {
        return dept;
    }

    public int GetNumOfSub() {
        return numOfSub;
    }

    public Subject[] getSubject() {
        return sub;
    }

    public void setSubjects(Subject... subs) {
        for (int i = 0; i < subs.length; i++)
            sub[i] = subs[i];
    }

    public String toString() {
        return "Roll :" + rollNo + "\nName :" + name + "\nDept :" + dept;
    }
}

public class ArrayOfObject {
    public static void main(String[] args) {
        /* Creating array of Objects */
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101", "DS", 100);
        subs[1] = new Subject("s102", "Algo", 100);
        subs[2] = new Subject("s103", "Math", 100);

        for (Subject s : subs) {
            System.out.println(s);
        }

    }
}
