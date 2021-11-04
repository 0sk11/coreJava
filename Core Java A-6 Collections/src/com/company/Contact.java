package com.company;

public class Contact {
    private long phoneNo;
    private String name;
    private String email;
    public enum Gender {male,female};
    public Contact(long phoneNo,String name,String email){
        this.phoneNo = phoneNo;
        this.name = name;
        this.email = email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
