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
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary () {
        return salary;
    }
    public int getId () {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(fullName, employee.fullName) && salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, salary, department);
}
