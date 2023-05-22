import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
//        company.hire(new Manager());
//        company.hire(new Manager());
//        company.hire(new Operator());
//        company.hire(new TopManager(company));
        company.hireAll(generateOperatorList(180));
        company.hireAll(generateManagerList(80));
        company.hireAll(generateTopManagerList(10, company));
        ArrayList <Employee> top = new ArrayList<>(company.getTopSalaryStaff(10));
        for (int i = 0; i < top.size(); i++) {
            System.out.println(top.get(i).getMonthSalary());
        }
        System.out.println("-------");
        ArrayList <Employee> low = new ArrayList<>(company.getLowestSalaryStaff(30));
        for (int i = 0; i < top.size(); i++) {
            System.out.println(low.get(i).getMonthSalary());
        }
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
}