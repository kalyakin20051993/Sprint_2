package model;

import model.constants.Discount;

public class Apple extends Food implements Discountable {
    String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if ("red".equals(colour)) {
            return Discount.RED_APPLE_DISCOUNT;
        } else {
            return Discount.OTHER_DISCOUNT;
        }
    }
}
