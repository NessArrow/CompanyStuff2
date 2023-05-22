public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.hire(new Manager(company));
        company.hire(new Manager(company));
        company.getList();
    }
}