package app;

import domain.Grade;
import domain.User;
import spec.rules.CanDiscountPercentageSpecification;
import spec.rules.CanDiscountSpecification;

public class App {

    public static void main(String[] args) {

        double orderAmount = 200;
        // double discountPercentage = 20;

        User[] users = {
            new User("Julie", Grade.Cashier),
            new User("Victor", Grade.Manager),
            new User("Hugo", Grade.SalesDirector)
        };

        for (User user : users) {
            CanDiscountSpecification cds = new CanDiscountSpecification(user);
            System.out.println("Can " + user + " discount a " + orderAmount + "$ order ? " + cds.isSatisfiedBy(orderAmount));
        }

        // for (User user : users) {
        //     CanDiscountSpecification cds = new CanDiscountSpecification(user);
        //     CanDiscountPercentageSpecification cdps = new CanDiscountPercentageSpecification(user, discountPercentage);
        //     System.out.println("Can " + user + " discount a " + orderAmount + "$ order with a " + discountPercentage + "% percentage ? " + cds.and(cdps).isSatisfiedBy(orderAmount));
        // }
    }
}