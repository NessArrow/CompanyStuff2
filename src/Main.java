import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.hire(new Manager());
        company.hire(new Manager());
        company.hire(new Operator());
        company.hire(new TopManager(company));
        company.hireAll(generateManagerList(10));
        company.getList();
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

    // написать методы, возвращающие списки топовых и худших сотрудников
}