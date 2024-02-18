//package com.driver;
//
//public class Pizza {
//
//    private int price;
//    private Boolean isVeg;
//    private String bill;
//
//
//    private int toppingPrice;
//    private int basePrice;
//
//    private boolean isExtraToppingDone = false;
//    private boolean isExtraCheseeDone = false;
//    private boolean isTakeAwayDone = false;
//    private boolean isBillingDone = false;
//
//
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        // your code goes here
//        if(isVeg) {
//            price = 300;
//            basePrice = 300;
//            toppingPrice = 70;
////            System.out.println("Base Price Of The Pizza: 300");
//        }
//        else {
//            price = 400;
//            basePrice = 400;
//            toppingPrice = 120;
////            System.out.println("Base Price Of The Pizza: 400");
//        }
//    }
//
////    Veg pizza base price = 300
////    Non-veg pizza base price = 400
////    Extra Cheese Price = 80
////    Extra Toppings For Veg Pizza = 70
////    Extra Toppings For Non-veg Pizza = 120
////    Paper bag Price = 20
//
//    public int getPrice(){
//        return this.price;
//    }
//
//    public void addExtraCheese(){
//        // your code goes here
//        if(!isExtraCheseeDone) {
//            price += 80;
//            isExtraCheseeDone = true;
////            System.out.println("Extra Cheese Added: 80");
//        }
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//        if(!isExtraToppingDone) {
//            price += toppingPrice;
//            isExtraToppingDone = true;
////            System.out.println("Extra Toppings Added: "+toppingPrice);
//        }
//    }
//
//    public void addTakeaway(){
//        // your code goes here
//        if(!isTakeAwayDone) {
//            price += 20;
//            isTakeAwayDone = true;
////            System.out.println("Paperbag Added: 20");
//        }
//    }
//
//    public String getBill(){
//        // your code goes here
//        if(!isBillingDone) {
//            this.bill = "Base Price Of The Pizza: " + basePrice;
//
//            if (isExtraCheseeDone) {
//                this.bill += "\nExtra Cheese Added: 80";
//            }
//
//            if (isExtraToppingDone) {
//                this.bill += "\nExtra Toppings Added: " + toppingPrice;
//            }
//
//            if (isTakeAwayDone) {
//                this.bill += "\nPaperbag Added: 20";
//            }
//
//            this.bill += "\nTotal Price: "+getPrice()+"\n";
//            isBillingDone = true;
//        }
//        return this.bill;
//}}







//
//package com.driver;
//
//public class Pizza {
//
//    private int price;
//
//    private Boolean isVeg;
//    private String bill;
//
//    private int cheese;
//    private int toppings;
//
//    boolean isExtraCheeseAdded;
//    boolean isExtraToppingsAdded;
//    boolean isTakeAwayAdded;
//    boolean isBillGenerated;
//
//    public Pizza( Boolean isVeg) {
//        this.isVeg = isVeg;
//        this.bill = "";
//        this.isExtraCheeseAdded = false;
//        this.isExtraToppingsAdded = false;
//        this.isTakeAwayAdded = false;
//        this.isBillGenerated = false;
//
//        if(isVeg){
//            this.price=300;
//            this.toppings=70;
//        }
//        else{
//            this.price=400;
//            this.toppings=120;
//        }
//        this.cheese=80;
//        this.bill += "Base Price Of The Pizza: "+this.price+"\n";
//    }
//
//    public int getPrice(){
//        return this.price;
//    }
//
//    public void addExtraCheese(){
//        // your code goes here
//        if(!isExtraCheeseAdded){
//            this.price=this.price+cheese;
//            this.isExtraCheeseAdded=true;
//        }
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//        if(!isExtraToppingsAdded){
//            this.price=this.price+toppings;
//            this.isExtraToppingsAdded=true;
//        }
//    }
//
//    public void addTakeaway(){
//        // your code goes here
//        if(!isTakeAwayAdded){
//            this.price+=20;
//            this.isTakeAwayAdded=true;
//        }
//    }
//
//    public String getBill(){
//        // your code goes here
//        if(!isBillGenerated){
//            if(isExtraCheeseAdded){
//                this.bill+="Extra Cheese Added: "+this.cheese+"\n";
//            }
//            if(isExtraToppingsAdded){
//                this.bill+="Extra Toppings Added: "+this.toppings+"\n";
//            }
//            if(isTakeAwayAdded){
//                this.bill += "Paperbag Added: "+"20"+"\n";
//            }
//            this.bill += "Total Price: "+this.price+"\n";
//            isBillGenerated = true;
//        }
//        return this.bill;
//    }
//}



package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int takeAwayPrice;

    private int extraCheesePrice;
    private int extraToppingPrice;
    public Pizza(Boolean isVeg){

        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isTakeAwayAdded=false;
        this.extraCheesePrice=80;
        this.isVeg = isVeg;
        // your code goes here

        this.takeAwayPrice=20;

        if(isVeg){
            this.price=300;
            this.extraToppingPrice=70;
        }else{
            this.price=400;
            this.extraToppingPrice=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    private int ExtraCheesePrice;

    private int ExtraToppingPrice;

    private boolean isCheeseAdded=false;

    private boolean isToppingAdded=false;

    private boolean isTakeAwayAdded=false;

    private boolean isBillGenerated=false;

    public int getPrice(){

        return this.price;
    }



    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price=this.price+this.extraCheesePrice;
            this.isCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            this.price=this.price+this.extraToppingPrice;
            this.isToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price=this.price+this.takeAwayPrice;
            this.isTakeAwayAdded=true;
        }
    }


    public String getBill() {
        // your code goes here

        if(isBillGenerated==false){

            isBillGenerated = true;

            if (isCheeseAdded) {
                this.bill = this.bill +"Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }

            if (isToppingAdded) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingPrice + "\n";
            }

            if (isTakeAwayAdded) {
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            return this.bill = this.bill + "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}