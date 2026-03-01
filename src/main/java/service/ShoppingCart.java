package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getPriceWithoutDiscount() {
        double total = 0;
        for (int i = 0; i < foods.length; i++) {
            total += foods[i].getCost();
        }
        return total;
    }

    public double getPriceWithDiscount() {
        double total = 0;
        for (int i = 0; i < foods.length; i++) {
            double discountedPrice = foods[i].getCost() * (1 - foods[i].getDiscount() / 100);
            total += discountedPrice;
        }
        return total;
    }

    public double getVegetarianPriceWithoutDiscount() {
        double total = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                total += foods[i].getCost();
            }
        }
        return total;
    }
}
