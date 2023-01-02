package com.bridgelabz.addressbook;

import java.util.Objects;

public class Contact {
    private String first_name;
    private String last_name;
    private String city;
    private String address;
    private String state;
    private int zip;
    private long phoneNum;
    private String email;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int Zip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNum=" + phoneNum +
                ", email='" + email + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return zip == contact.zip && phoneNum == contact.phoneNum && Objects.equals(first_name, contact.first_name) && Objects.equals(last_name, contact.last_name) && Objects.equals(city, contact.city) && Objects.equals(address, contact.address) && Objects.equals(state, contact.state) && Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name, city, address, state, zip, phoneNum, email);
    }
}