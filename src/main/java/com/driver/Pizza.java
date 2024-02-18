package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


    private int toppingPrice;
    private int basePrice;

    private boolean isExtraToppingDone = false;
    private boolean isExtraCheseeDone = false;
    private boolean isTakeAwayDone = false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            price = 300;
            basePrice = 300;
            toppingPrice = 70;
//            System.out.println("Base Price Of The Pizza: 300");
        }
        else {
            price = 400;
            basePrice = 400;
            toppingPrice = 120;
//            System.out.println("Base Price Of The Pizza: 400");
        }
    }

//    Veg pizza base price = 300
//    Non-veg pizza base price = 400
//    Extra Cheese Price = 80
//    Extra Toppings For Veg Pizza = 70
//    Extra Toppings For Non-veg Pizza = 120
//    Paper bag Price = 20

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheseeDone) {
            price += 80;
            isExtraCheseeDone = true;
//            System.out.println("Extra Cheese Added: 80");
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingDone) {
            price += toppingPrice;
            isExtraToppingDone = true;
//            System.out.println("Extra Toppings Added: "+toppingPrice);
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayDone) {
            price += 20;
            isTakeAwayDone = true;
//            System.out.println("Paperbag Added: 20");
        }
    }

    public String getBill(){
        // your code goes here
        this.bill =   "Base Price Of The Pizza: "+basePrice+ "\nExtra Cheese Added: 80"+
                "\nExtra Toppings Added: "+toppingPrice
                +"\nPaperbag Added: 20"+"\nTotal Price: "+price;
        return this.bill;
    }
}
