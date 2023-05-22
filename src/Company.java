import java.util.*;

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
    List<Employee> getTopSalaryStaff(int count) {
        List<Employee> list = new ArrayList<>();
        if (count <= numEmployees && count > 0) {
            employees.sort(new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    if (o1.getMonthSalary() > o2.getMonthSalary()) {
                        return -1;
                    } else if (o1.getMonthSalary() < o2.getMonthSalary()) {
                        return 1;
                    } else return 0;
                }
            });
            for (int i = 0; i < count; i++) {
                list.add(employees.get(i));
            }
            return list;
        } else return null;
    }
    List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> list = new ArrayList<>();
        if (count <= numEmployees && count > 0) {
            employees.sort(new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    if (o1.getMonthSalary() > o2.getMonthSalary()) {
                        return 1;
                    } else if (o1.getMonthSalary() < o2.getMonthSalary()) {
                        return -1;
                    } else return 0;
                }
            });
            for (int i = 0; i < count; i++) {
                list.add(employees.get(i));
            }
            return list;
        } else return null;
    }
    private void addIncome(double a) {
        totalIncome += a;
    }
}
