import java.util.ArrayList;
import java.util.List;

public class Company {
    private int numEmployees = 0;
    private double totalIncome = 0;
    ArrayList<Employee> employees = new ArrayList<>();
    public void hire(Employee employee) {
        employees.add(employee);
        addIncome(employee.getIncome());
        numEmployees++;
    }
    public void hireAll(List<Employee> employees) {
        for(Employee emp : employees) {
            hire(emp);
        }
    }
    public void fire(Employee employee) {
        employees.remove(employee);
        totalIncome -= employee.getIncome();
        numEmployees--;
    }
    public long getIncome() {
        return Math.round(totalIncome);
    }
    public void getList() {
        for (Employee emp : employees) {
            System.out.println(emp.getMonthSalary() +" " + emp.getIncome());
        }
        System.out.println("---");
        System.out.println(totalIncome);
        System.out.println(numEmployees);
    }
//    List<Employee> getTopSalaryStaff(int count) {
//        if (count <= numEmployees && count > 0) {
//            //нужен компаратор и здесь нужно сравнивать
//        } else return null;
//    }
//    List<Employee> getLowestSalaryStaff(int count) {
//        if (count <= numEmployees && count > 0) {
//
//        } else return null;
//    }
    private void addIncome(double a) {
        totalIncome += a;
    }
}
