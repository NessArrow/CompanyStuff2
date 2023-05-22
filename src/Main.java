import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        company.hireAll(generateOperatorList(180));
        company.hireAll(generateManagerList(80));
        company.hireAll(generateTopManagerList(10, company));

        printList(new ArrayList<>(company.getTopSalaryStaff(10)));
        printList(new ArrayList<>(company.getLowestSalaryStaff(30)));

        company.fireList(new ArrayList<>(company.getNumEmployees()/2));

        printList(new ArrayList<>(company.getTopSalaryStaff(10)));
        printList(new ArrayList<>(company.getLowestSalaryStaff(30)));

    }
    public static ArrayList<Employee> generateManagerList(int count) {
        ArrayList <Employee> emp = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            emp.add(new Manager());
        }
        return emp;
    }
    public static ArrayList<Employee> generateOperatorList(int count) {
        ArrayList <Employee> emp = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            emp.add(new Operator());
        }
        return emp;
    }
    public static ArrayList<Employee> generateTopManagerList(int count, Company company) {
        ArrayList <Employee> emp = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            emp.add(new TopManager(company));
        }
        return emp;
    }
    public static void printList(ArrayList<Employee> list) {
        System.out.println("----------------");
        for(Employee e : list) {
            System.out.println(e.getMonthSalary());
        }
        System.out.println("----------------");
    }
}