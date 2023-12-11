package DeitelJavaProgrammingBook.ChapterThree;

//3.12 (Class PetrolPurchase)

/*
aw.
Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of
instance variables—the station’s location (type String), the type of petrol (type String),
the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage discount
(double). Your class should have a constructor that initializes the five instance variables. Provide a
set and a get method for each instance variable. In addition, provide a method named getPurchase Amount that calculates
the net purchase amount (i.e., multiplies the quantity by the price per liter) minus the discount, then returns the net amount you had to pay as a double value.
Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase

 */
public class PetrolPurchase {

   private String stationLocation;
   private String typeOfPetrol;
   private int quantityOfPurchaseInLitres;
   private double pricePerLitre;
   private double percentageDiscount;

   public PetrolPurchase(String stationLocation,String typeOfPetrol, int quantityOfPurchaseInLitres, double pricePerLitre, double percentageDiscount){
       this.stationLocation = stationLocation;
       this.typeOfPetrol = typeOfPetrol;
       this.quantityOfPurchaseInLitres = quantityOfPurchaseInLitres;
       this.pricePerLitre = pricePerLitre;
       this.percentageDiscount = percentageDiscount;
    }
    public void setStationLocation(String stationLocation){

       this.stationLocation = stationLocation;
    }
    public String getStationLocation(){

       return stationLocation;
    }

    public void setTypeOfPetrol(String typeOfPetrol){

       this.typeOfPetrol = typeOfPetrol;
    }
    public String getTypeOfPetrol(){

       return typeOfPetrol;
    }

    public void setQuantityOfPurchaseInLitres(int quantityOfPurchaseInLiters) {
        this.quantityOfPurchaseInLitres = quantityOfPurchaseInLitres;
    }
    public int getQuantityOfPurchaseInLitres(){

       return quantityOfPurchaseInLitres;
    }
    public void setPricePerLitres(double pricePerLitre){

       this.pricePerLitre = pricePerLitre;
    }
    public double getPricePerLitre(){

       return pricePerLitre;
    }
    public void setPercentageDiscount(double percentageDiscount){

       this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount(){

       return percentageDiscount;
    }

    public double getPurchase() {
       double totalAmount = quantityOfPurchaseInLitres * pricePerLitre;
       double discountAmount = totalAmount * (percentageDiscount / 100);
       double netPurchaseAmount = totalAmount - discountAmount;
       return netPurchaseAmount;

    }
}
