package Airline;
import java.util.Arrays;
import java.util.Random;

public class Person {
    
    private String name;
    private String nationality;
    private String dateOfBirth;
    String[] passport;
    private int seatNumber;


    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }

    public boolean applyPassport(){
        Random rd = new Random();
        return rd.nextBoolean();
    }

    public void chooseSeat(){
        double ranNum = Math.random() * 11;
        ranNum += 1;
        this.seatNumber = (int)ranNum;
    }

    public String getName(){
        return this.name;
    }
    public String getNationality(){
        return this.nationality;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public int getSeatNumber(){
        return this.seatNumber;
    }
    public String[] getPassport(){
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }

    public void setPassport(){
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
    }

    public String toString(){
        return "Name: " + this.name + "\n" + "Nationality: " + 
                this.nationality + "\n" + "Date of Birth: " + 
                this.dateOfBirth + "\n" + "Seat Number: " +
                this.seatNumber + "\n" + "Passport: " + 
                Arrays.toString(this.passport) + "\n";
    }




}
