import java.util.Objects;

public class Employee {
    private int id;
    private String fullName;
    private int department;
    private int salary;
    private static int countId = 1;


    public Employee() {
        this.id = countId++;

    }

    public Employee (String fullName, int department, int salary) {
        this.id = countId++;

    }

}
