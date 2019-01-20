package domain;

public enum Grade {
    Manager("Manager"), Cashier("Cashier"), SalesDirector("Sales Director");

    private final String text;

    Grade(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}