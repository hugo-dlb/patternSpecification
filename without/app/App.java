package app;

import domain.Grade;
import domain.User;

public class App {

    public static void main(String[] args) {

        double orderAmount = 400;
        // double discountPercentage = 20;

        User[] users = {
            new User("Julie", Grade.Cashier),
            new User("Victor", Grade.Manager),
            new User("Hugo", Grade.SalesDirector)
        };

        for (User user : users) {
            boolean canDiscount = true;

            switch (user.getGrade()) {
                case Cashier:
                    canDiscount = false;
                    break;
                case Manager:
                    if (orderAmount > 300) {
                        canDiscount = false;
                    }
                    break;
                case SalesDirector:
                    if (orderAmount > 1000) {
                        canDiscount = false;
                    }
                    break;
            }

            System.out.println("Can " + user + " discount a " + orderAmount + "$ order ? " + canDiscount);
        }

        // for (User user : users) {
        //     boolean canDiscount = true;

        //     switch (user.getGrade()) {
        //         case Cashier:
        //             canDiscount = false;
        //             break;
        //         case Manager:
        //             if (orderAmount > 300 || discountPercentage > 20) {
        //                 canDiscount = false;
        //             }
        //             break;
        //         case SalesDirector:
        //             if (orderAmount > 1000 || discountPercentage > 40) {
        //                 canDiscount = false;
        //             }
        //             break;
        //     }

        //     System.out.println("Can " + user + " discount a " + orderAmount + "$ order with a " + discountPercentage + "% percentage ? " + canDiscount);
        // }
    }
}