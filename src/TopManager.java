public class TopManager extends Staff{
    final int FIX = 100000;
    final double BONUS = 1.5;

    public TopManager(Company company) {
        setSalary(company.getIncome());
        setIncome();
    }

    protected void setSalary(long total) {
        salary = FIX;
        if (total > 10000000) {
            salary += salary * BONUS;
        }
    }
}
