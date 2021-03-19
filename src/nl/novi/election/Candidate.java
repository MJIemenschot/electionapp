package nl.novi.election;

public class Candidate extends Person {
      /*Dit kan werden vervangen door extends Person:

    public String firstName;
    public String lastName;


    public String getFullName() {
        return this.firstName + " " + this.lastName;*
    }*/
    public Party currentParty;
    public boolean isLijstTrekker = false;


    public void talk() {
        System.out.println("Kandidaat van de Partij: " + currentParty.name + " praat veel: " + super.lastName);

    }
}
