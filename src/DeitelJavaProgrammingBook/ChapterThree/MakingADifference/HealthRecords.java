package DeitelJavaProgrammingBook.ChapterThree.MakingADifference;
public class HealthRecords {
private String firstName;
private String lastName;
private String gender;
private String month;
private int day;
private String year;
private int height;
private double weight;

    int years;
    int age = (years * 365) + ((month * 31) + day);

    public HealthRecords(String firstName, String lastName, String gender, String month, int day, String year, int height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.height = height;
        this.weight = weight;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
}
