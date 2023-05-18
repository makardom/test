package Task2;

public class Employee implements Measurable {
    private String name;
    private int measurable;

    public Employee(int n){ this.measurable = n; }
    @Override
    public double getMeasure() {
        return this.measurable;
    }
}