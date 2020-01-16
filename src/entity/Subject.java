package entity;

import java.io.Serializable;

public class Subject implements Serializable {
    private String schoolSubjects;
    private int hours;
    
    public String getSchoolSubject() {
        return schoolSubjects;
    }

    public void setSchoolSubject(String predmeti) {
        this.schoolSubjects = predmeti;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public String toString() {
        return "Subject{" +"subject = " +schoolSubjects+ ", hours = " +hours+ "}";
    }

    public void setHours(String newHours) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}