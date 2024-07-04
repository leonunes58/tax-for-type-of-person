package entities;

public class PhysicalPerson extends Contributor{
    private Double health;

    public PhysicalPerson(String name, Double annualIncome, Double health) {
        super(name, annualIncome);
        this.health = health;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    @Override
    public double taxPaid() {
        if(health > 0) {
            if (super.getAnnualIncome() >= 20000.0) {
                return (super.getAnnualIncome() * 0.25) - (health * 0.5);
            }
            else{
                return (super.getAnnualIncome() * 0.15) - (health * 0.5);
            }
        }
        else{
            if (super.getAnnualIncome() >= 20000.0) {
                return (super.getAnnualIncome() * 0.25) - health;
            }
            else{
                return super.getAnnualIncome() * 0.15 - health;
            }
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String anualIncomeFormat = String.format("%.2f", taxPaid());
        sb.append(getName()).append(" $").append(anualIncomeFormat).append("\n");
        return sb.toString();
    }
}
