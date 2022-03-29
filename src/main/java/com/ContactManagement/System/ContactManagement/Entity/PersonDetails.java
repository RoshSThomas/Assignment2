package com.ContactManagement.System.ContactManagement.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PersonDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int Id;

    String Name;
    String Address;
    int CountryCode;
    long PhoneNumber;
    String Email;

    public PersonDetails() {
    }

    public PersonDetails(int id, String name, String address, int countryCode, long phoneNumber, String email) {
        Id = id;
        Name = name;
        Address = address;
        CountryCode = countryCode;
        PhoneNumber = phoneNumber;
        Email = email;
    }

    public PersonDetails(String name, String address, int countryCode, long phoneNumber, String email) {
        Name = name;
        Address = address;
        CountryCode = countryCode;
        PhoneNumber = phoneNumber;
        Email = email;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(int countryCode) {
        CountryCode = countryCode;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
