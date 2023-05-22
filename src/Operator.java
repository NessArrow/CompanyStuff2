public class Operator implements Employee{
    final int FIX = 10000;
    private double income;
    private int salary;
    public Operator() {
        income = 0;
        salary = FIX;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public double getIncome() {
        return 0;
    }
}
