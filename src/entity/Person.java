package entity;

import java.io.Serializable;

public class Person implements Serializable {
    private String fname;
    private String sname;
    private String status;

    public String getFName() {
        return fname;
    }

    public void setFName(String fname) {
        this.fname = fname;
    }
    
    public String getSName() {
        return sname;
    }

    public void setSName(String sname) {
        this.sname = sname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String toString() {
        return "Person{" +"Имя = " + fname + " Фамилия = " + sname + ", status = "+ status +"}";
    }

}