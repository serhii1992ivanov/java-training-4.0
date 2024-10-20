public class Main {
  public static void main(String[] args) {

    SalariedEmployee salariedEmployee = new SalariedEmployee("ID13", "Grisha", "777");
    salariedEmployee.setFixedMonthlyPayment(3550);

    ContractedEmployee contractedEmployee = new ContractedEmployee("ID89", "Olha", "9379992");
    contractedEmployee.setHourlyRate(25.33);
    contractedEmployee.setNumberOfHoursWorked(160);


    salariedEmployee.calculatePay();
    contractedEmployee.calculatePay();


    Employee[] employees = {salariedEmployee, contractedEmployee};


    for (Employee emp : employees) {
      System.out.println(emp);
    }
  }
}