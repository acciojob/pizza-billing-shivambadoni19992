package com.driver;

public class Pizza {

    private int price; // total
    private int cheese;
    private int toppings;
    private int paper;
    private boolean isBillCreated;
    private boolean isVeg;
    private boolean isTakenAway;
    private String bill;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.bill = "";
        if (isVeg)
            this.price = 300;
        else
            this.price = 400;
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (cheese == 0) {
            this.cheese += 80;
            this.price += 80;
        }
    }

    public void addExtraToppings() {
        if (toppings == 0) {
            this.toppings += isVeg ? 70 : 120;
            this.price += isVeg ? 70 : 120;
        }
    }

    public void addTakeaway() {
        if (!isTakenAway) {
            this.paper += 20;
            this.price += 20;
            isTakenAway = true;
        }
    }

    public String getBill() {
        if (!isBillCreated) {
            isBillCreated = true;
            int base;
            if (isVeg)
                base = 300;
            else
                base = 400;

            bill += "Base Price Of The Pizza: " + base + "\n";

            if (cheese > 0)
                bill += "Extra Cheese Added: " + cheese + "\n";

            if (toppings > 0)
                bill += "Extra Toppings Added: " + toppings + "\n";

            if (paper > 0)
                bill += "Paperbag Added: " + paper + "\n";

            bill += "Total Price: " + price + "\n";
        }
        return this.bill;
    }
}
