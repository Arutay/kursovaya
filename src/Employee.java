public class Employee {
    private final Integer id;
    private String fullName;
    private Integer salary;
    private Integer departmentId;

    private static Integer idCounter = 1;


    public Employee(String fullName, Integer salary, Integer departmentId) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" +salary+
                ", departmentId=" + departmentId+
                '}';
    }
}




