public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.hire(new Manager());
        company.hire(new Manager());
        company.hire(new Operator());
        company.hire(new TopManager(company));
        company.getList();
    }
}