public class employee {

    private String name;
    private int emp_id;
    private int salary;

    public employee(String name, int emp_id, int salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Salary: " + salary);
    }

}
