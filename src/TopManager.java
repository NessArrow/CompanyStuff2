public class TopManager implements Employee {
    final int FIX = 40000;
    private double income;
    private int salary;

    public TopManager(Company company) {
        setSalary(company.getIncome());
        setIncome();
    }
    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public double getIncome() {
        return income;
    }
    private void setIncome() {
        income = 0;
    }

    private void setSalary(long total) {
        salary = FIX;
        if (total > 10000000) {
            salary += salary * 1.5;
        }
    }
}
