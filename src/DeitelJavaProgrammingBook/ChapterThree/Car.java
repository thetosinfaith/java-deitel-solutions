package DeitelJavaProgrammingBook.ChapterThree;

/*
3.13 (Car Class) Create a class called Car that includes three instance variables—a model (type
String), a year (type String), and a price (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the price is not positive,
do not set its value. Write a test application named CarApplication that demonstrates class Car’s capabilities.
Create two Car objects and display each object’s price. Then apply a 5% discount on the
price of the first car and a 7% discount on the price of the second. Display each Car’s price again.
 */

import java.util.concurrent.Callable;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double percentage) {
        double discount = price * percentage / 100;
        price -= discount;

    }


    public class CarApplication {
        public static void main(String[] args) {
            Car car1 = new Car("Honda", "2022", 9.000);
            Car car2 = new Car("Toyota", "2015", 2.000);

            System.out.println("Original Prices");
            System.out.println("First Car Price: " + car1.getPrice());
            System.out.println("Second Car Price: " + car2.getPrice());

            System.out.println("Discounts");
            double discount1 = 0.1;
            double discount2 = 0.4;

            double discountPercentageFirst = 5;
            double discountPercentageSecond = 7;

            car1.applyDiscount(discountPercentageFirst);
            car2.applyDiscount(discountPercentageSecond);

            System.out.println("\nPrices After Discounts:");
            System.out.println("First Car Price (after " + discountPercentageFirst + "% discount): $" + car1.getPrice());
            System.out.println("Second Car Price (after " + discountPercentageSecond + "% discount): $" + car2.getPrice());
        }
    }
}