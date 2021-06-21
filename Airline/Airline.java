package Airline;
public class Airline {
    private Person[] seat;

    public Airline(){
        this.seat = new Person[11];
    }

    public Person getPerson(int index){
        return new Person(this.seat[index]);
    }

    public void setPerson(Person person, int seatNumber){
        this.seat[seatNumber] = new Person(person);
    }

    public void setPerson(Person person) {
        this.seat[person.getSeatNumber() - 1] = new Person(person);
    }
 
    public void createReservation(Person person) {
        while (seat[person.getSeatNumber() - 1] != null) {
            System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.\n");
            person.chooseSeat(); 
        }
 
        int index = person.getSeatNumber() - 1;
        seat[index] = new Person(person); 
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".\n");
    }

    public String toString() {
        String temp = " ";
        for (int i = 0; i < this.seat.length; i++) {
            if (this.seat[i] != null) {
                temp += this.seat[i].toString();
                temp += "\n\n";
            } else {
                temp += "Seat " + (i+1) + " is empty";
                temp += "\n\n";
            }
            
        }
        return temp;
    }

}
