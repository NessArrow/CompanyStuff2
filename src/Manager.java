public class Manager implements Employee {
    final int MIN_INCOME = 115000;
    final int MAX_INCOME = 140000;
    final int FIX = 30000;
    final double BONUS = 0.05;
    private double income;
    private int salary;

    public Manager() {
        setIncome();
        setSalary();
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
    public void setIncome() {
        income = (Math.random() * ((MAX_INCOME - MIN_INCOME) + 1)) + MIN_INCOME;
    }
    @Override
    public double getIncome() {
        return income;
    }
    private void setSalary() {
        salary = (int)Math.round(FIX + getIncome() * BONUS);
    }

}
