package nl.novi.election;

import java.util.ArrayList;

public class Election {

    public void preparePerson()
    {
        Person person1 = new Person();
        Person person2 = new Voter();
        Person person3 = new Candidate();
        person1.breath();
        person2.breath();
        person3.breath();

        //lege lijst
        ArrayList<Person> persons = new ArrayList<Person>();
        //hier kan je personen toevoegen
        persons.add(person1);
        persons.add(person2);

        Voter voter1 = new Voter();
        Candidate candidate1 = new Candidate();
    }

    public void prepareCandidates() {
        Party vvd = new Party();
        vvd.name = "VVD";

        Candidate rutte = new Candidate();
        rutte.firstName = "Mark";
        rutte.lastName = "Rutte";
        rutte.currentParty = vvd;
        rutte.isLijstTrekker = true;
        rutte.talk();

        System.out.println("Kandidaat toegevoegd: " + rutte.getFullName());
    }

    public void prepareVoters() {

        Candidate rutte = new Candidate();
        rutte.firstName = "Mark";
        rutte.lastName = "Rutte";

        Voter marie = new Voter();
        marie.firstName = "Mark";
        marie.lastName = "Marie";
        marie.vote(rutte);


        System.out.println("Stemmer toegevoegd: " + marie.getFullName());
    }


}
