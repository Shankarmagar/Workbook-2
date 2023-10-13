package org.example;

public class Main {
    public static void main(String[] args) {
        Donut [] donuts = new Donut[6];
        donuts[0] = new Donut("Glazed Donut", 500, 4.35, "The classic ring-shaped donut with a sugary glaze.");
        donuts[1] = new Donut("Chocolate Glazed Donut", 400, 3.35,"A variation of the glazed donut with a chocolate glaze.");
        donuts[2] = new Donut("Jelly Donut", 350, 4.45, "A donut filled with fruit jelly, often raspberry or strawberry, and dusted with powdered sugar.");
        donuts[3] = new Donut("Cream-Filled Donut", 350, 4.45, "A donut filled with various flavored creams, such as vanilla, chocolate, or custard.");
        donuts[4] = new Donut("Boston Cream Donut", 350, 4.45, "A round, chocolate-glazed donut filled with custard or cream.");
        donuts[5] = new Donut("Cinnamon Sugar Donut", 350, 4.45, "A donut coated in a mixture of cinnamon and sugar.");


        double TotalPrice = 0.00;
        System.out.println("Welcome to Donut-Shop:-");
        System.out.println("----------------------------------------------");
        for (Donut d: donuts)
        {
            TotalPrice += d.price;
            String output = d.toString();
            System.out.println(output);
            System.out.println("//---------------------------------------------------//");
        }
        System.out.printf("Total price for all donuts are as follows: $%.2f", TotalPrice);

    }
}