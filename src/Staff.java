abstract class Staff implements Employee, Comparable<Employee>{
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
    protected void setSalary(int fix) {
        salary = fix;
    }

    @Override
    public int compareTo(Employee o) {
        if (salary > o.getMonthSalary()) {
            return 1;
        } else if (salary < o.getMonthSalary()) {
            return -1;
        } else return 0;
    }
}
