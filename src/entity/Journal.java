package entity;

import java.io.Serializable;
import java.util.Date;

public class Journal implements Serializable {
    private Date giveOutJournal;
    private Date returnJournal;
    private String ocenka;
    private Person person;
    private Subject subject;

    public Journal() {
    }

    public Journal(Date giveOutJournal, Date returnJournal, String ocenka, Person person, Person secondName, Subject subject) {
        this.giveOutJournal = giveOutJournal;
        this.returnJournal = returnJournal;
        this.ocenka = ocenka;
        this.person = person;
        this.subject = subject;
    }

    public Date getGiveOutJournal() {
        return giveOutJournal;
    }

    public void setGiveOutJournal(Date giveOutJournal) {
        this.giveOutJournal = giveOutJournal;
    }

    public Date getReturnJournal() {
        return returnJournal;
    }

    public void setReturnJournal(Date returnJournal) {
        this.returnJournal = returnJournal;
    }

    public String getOcenka() {
        return ocenka;
    }

    public void setOcenka(String ocenka) {
        this.ocenka = ocenka;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Journal{" + "giveOutJournal=" + giveOutJournal + ", returnJournal=" + returnJournal + ", mark=" + ocenka
                + ", person=" + person.getFName() 
                + " " + person.getSName()
                + ", subject=" + subject.getSchoolSubject() + '}';
    }

    
}