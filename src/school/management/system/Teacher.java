package school.management.system;

public class Teacher {

    /**
     * Responsible for keeping the track of teacher's data
     */
    private int id;
    private String name;
    private int salary;

    /**
     * Creates a new teacher object
     * @param id for the teacher
     * @param name of the teacher
     * @param salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return the id of the teacher.
     */
    public int getId() {
        return  this.id;
    }

    /**
     *
     * @return the teacher's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return the salary.
     */
    public int getSalary() {
        return this.salary;
    }

    /**
     * Set the salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;

    }


}
