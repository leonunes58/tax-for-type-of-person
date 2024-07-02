package entities;

public class LegalPerson extends Contributor {
    private Integer numberEmployees;

    public LegalPerson(String name, Double annualIncome, Integer numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double taxPaid() {
        if(numberEmployees > 10) {
            return super.getAnnualIncome() * 0.14;
        }
        else {
            return super.getAnnualIncome() * 0.16;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" $").append(taxPaid());
        return sb.toString();
    }
}
