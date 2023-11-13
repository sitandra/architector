package add.n1;

public class Salary {
    private static float tax = 0.25f;
    private int baseSalary;

    public Salary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * Salary.tax);
        return baseSalary - tax;
    }
}
