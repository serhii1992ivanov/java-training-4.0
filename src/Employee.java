public abstract class Employee implements Payable {
    private String employeeId;
    private String name;
    protected double averageMonthlySalary;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Average Monthly Salary: " + String.format("%.2f", averageMonthlySalary);
    }
}