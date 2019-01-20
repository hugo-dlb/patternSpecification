package spec.rules;

import domain.User;
import spec.AbstractSpecification;

public class CanDiscountPercentageSpecification extends AbstractSpecification {

    private User user;
    private double discountPercentage;

    public CanDiscountPercentageSpecification(User user, double discountPercentage) {
        this.user = user;
        this.discountPercentage = discountPercentage;
    }

    public boolean isSatisfiedBy(Object orderAmount) {
        switch (this.user.getGrade()) {
            case Cashier:
                return false;
            case Manager:
                return (double) discountPercentage <= 20;
            case SalesDirector:
                return (double) discountPercentage <= 40;
            default:
                return false;
        }
    }
}