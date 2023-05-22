public class Manager extends Staff {
    final int MIN_INCOME = 115000;
    final int MAX_INCOME = 140000;
    final int FIX = 30000;
    final double MANAGER_BONUS = 0.05;

    public Manager() {
        setIncome();
        setSalary();
    }
    @Override
    protected void setIncome() {
        income = (Math.random() * ((MAX_INCOME - MIN_INCOME) + 1)) + MIN_INCOME;
    }
    protected void setSalary() {
        salary = (int)Math.round(FIX + getIncome() * MANAGER_BONUS);
    }

}
