package com.example.domain.user;

import com.example.domain.user.Gender;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable {
    private Integer uId;
    private String uName;
    private String uPassWord;
    private String uPhone;
    private String uAddress;
    private Date uBornDate;
    private String uEmail;
    private String uIdentityCard;
    private Gender gender;
    private boolean enabled;

    public User() {
    }

    public User(Integer uId, String uName, String uPassWord, String uPhone,
                String uAddress, Date uBornDate, String uEmail, String uIdentityCard,
                Gender gender,boolean enabled) {
        this.uId = uId;
        this.uName = uName;
        this.uPassWord = uPassWord;
        this.uPhone = uPhone;
        this.uAddress = uAddress;
        this.uBornDate = uBornDate;
        this.uEmail = uEmail;
        this.uIdentityCard = uIdentityCard;
        this.gender = gender;
        this.enabled = enabled;
    }

    public User(String uName, String uPassWord, String uPhone,
                String uAddress, Date uBornDate, String uEmail,
                String uIdentityCard, Gender gender,boolean enabled) {
        this.uName = uName;
        this.uPassWord = uPassWord;
        this.uPhone = uPhone;
        this.uAddress = uAddress;
        this.uBornDate = uBornDate;
        this.uEmail = uEmail;
        this.uIdentityCard = uIdentityCard;
        this.gender = gender;
        this.enabled = enabled;

    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPassWord='" + uPassWord + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", uAddress='" + uAddress + '\'' +
                ", uBornDate=" + uBornDate +
                ", uEmail='" + uEmail + '\'' +
                ", uIdentityCard='" + uIdentityCard + '\'' +
                ", gender=" + gender +
                ", enabled=" + enabled +
                '}';
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassWord() {
        return uPassWord;
    }

    public void setuPassWord(String uPassWord) {
        this.uPassWord = uPassWord;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public Date getuBornDate() {
        return uBornDate;
    }

    public void setuBornDate(Date uBornDate) {
        this.uBornDate = uBornDate;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuIdentityCard() {
        return uIdentityCard;
    }

    public void setuIdentityCard(String uIdentityCard) {
        this.uIdentityCard = uIdentityCard;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

