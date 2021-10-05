package serializable;

public class Administrator extends Employee{
    private double incentive;

    public Administrator(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        incentive=0;
    }


    public double getSalary() {
        double salaryBase=super.getSalary();

        return salaryBase+incentive;
    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }



    public String toString() {
        return super.toString() +
                "incentive=" + incentive;
    }

}
