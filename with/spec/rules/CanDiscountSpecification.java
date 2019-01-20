package spec.rules;

import domain.User;
import spec.AbstractSpecification;

public class CanDiscountSpecification extends AbstractSpecification {

    private User user;

    public CanDiscountSpecification(User user) {
        this.user = user;
    }

    public boolean isSatisfiedBy(Object orderAmount) {
        switch (this.user.getGrade()) {
            case Cashier:
                return false;
            case Manager:
                return (double) orderAmount < 300;
            case SalesDirector:
                return (double) orderAmount < 1000;
            default:
                return false;
        }
    }
}