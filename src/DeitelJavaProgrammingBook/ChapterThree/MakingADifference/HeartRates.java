package DeitelJavaProgrammingBook.ChapterThree.MakingADifference;
/*
 Create a class called HeartRates. The class attributes
should include the person’s first name, last name and date of birth (consisting of separate attributes
for the month, day and year of birth). Your class should have a constructor that receives this data as
parameters. For each attribute provide set and get methods. The class also should include a method
that calculates and returns the person’s age (in years), a method that calculates and returns the
person’s maximum heart rate and a method that calculates and returns the person’s target heart rate.
Write a Java app that prompts for the person’s information, instantiates an object of class HeartRates
 and prints the information from that object—including the person’s first name, last name and
date of birth—then calculates and prints the person’s age in (years), maximum heart rate and targetheart-rate range.
 */
public class HeartRates {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int month;
    private int day;
    private int yearOfBirth;

    int years;
    int age = (years * 365) + ((month * 31) + day);


    public HeartRates(String firstName, String lastName, String dateOfBirth, int month, int day, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.month = month;
        this.day = day;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calculateUserAgeInYears(int years){
        int age = (years * 365) + ((month * 31) + day);
        return age;
    }
    public double calculateMinimumHeartRate(double user, double intensity){
        double heartRateMax = 220 - age;
        double heartRateMin = heartRateMax * intensity;

        return heartRateMin;
    }
}
