public class Operator extends Staff{
    final int FIX = 20000;

    public Operator() {
        setIncome();
        setSalary(FIX);
    }
    protected void setSalary(int FIX) {
        salary = FIX;
    }
}
