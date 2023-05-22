abstract class Staff implements Employee {
    double income;
    int salary;

    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public double getIncome() {
        return income;
    }
    protected void setIncome() {
        income = 0;
    }
    protected void setSalary() {
        salary = 0;
    }
}
