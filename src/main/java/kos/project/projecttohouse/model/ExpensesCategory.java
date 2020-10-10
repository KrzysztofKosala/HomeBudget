package kos.project.projecttohouse.model;

public enum ExpensesCategory {

    JEDZENIE ("Żywność"),
    IMPREZY ("Imprezy/alkohol"),
    UBRANIA ("Odzierz");

    private String specification;

    ExpensesCategory(String opis) {
        this.specification = specification;
    }

    public String getSpecification() {
        return specification;
    }
}
