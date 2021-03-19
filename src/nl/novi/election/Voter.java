package nl.novi.election;

public class Voter extends Person {
    /*Het volgende kan worden vervangen door extends Person:

    public String firstName;
    public String lastName;


    public String getFullName() {
        return this.firstName + " " + this.lastName;*
    }*/
    private Candidate votesFor;

    public void vote(Candidate newCandidate) {
        this.votesFor = newCandidate;
        System.out.println("Stem uitgebracht door: " + lastName + " op " + this.votesFor.getFullName());

    }
}
