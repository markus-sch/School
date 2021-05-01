package school.management.system;

/*
 * This class is responsible for keeping the track
 * of students fees, name, grade and fees
 * paid.
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student object by initializing the values
     * Fees for every student is $30.000.
     * Fees paid initially is 0.
     * @param id for the student: unique
     * @param name of the student
     * @param grade of the student
     * @return
     */

    public Student(int id, String name, int grade) {
        feesPaid = 0;     // Hier braucht man this am Anfang nicht (kann man aber nutzen), weil feesPaid nur einmal vorkommt,
                          // nur in der Class.
        this.feesTotal = 30000;
        this.id = id;     // private int id ist gleich der id aus public student(int id, ...)
        this.name = name;
        this.grade = grade;

    }

    // We are not going to alter a student's name, id

    /**
     * Used to upgrade the student's grade
     * @param grade is new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;

    }

    /**
     * Keep adding the fees to the feesPaid field.
     * The school is going to receive the funds.
     * @param fees that the stundet pays
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    /**
     * Getter für alle oben angegebenen Felder.
     * @return
     */

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public int getGrade() {

        return grade;
    }

    public int getFeesPaid() {

        return feesPaid;
    }

    public int getFeesTotal() {

        return feesTotal;
    }

    /**
     * @return the remaining fees.
     */
    public int getRemainingFees() {
         return feesTotal - feesPaid;
    }
}
