package org.example;

public class Donut {
    String type;
    int calories;
    double price;
    String description;

    Donut(String t, int c, double p, String des)
    {
     this.type = t;
     this.calories =c;
     this.price =p;
     this.description =des;
    }
    public String toString()
   {
       return "Type of donut is: "+ this.type + "\nCalories: "+ this.calories +"\nPrice: $"+ this.price+"\nDescription: "+ this
               .description;
   }

}
