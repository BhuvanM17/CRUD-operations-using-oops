package com.xworkz.passportapp;

import com.xworkz.passportapp.passport.Passport;
import com.xworkz.passportapp.passport.impl.PassportImpl;
import com.xworkz.passportapp.user.User;

public class PassportRunner {
    public static void main(String[] args) {
        User user = new User();
        user.setUserId(76);
        user.setUserName("Agasthya");
        user.setUserAge(45);
        user.setCountry("India");

        Passport passport = new PassportImpl();
        passport.addDetails(user);
        passport.getPassportDetails();

        passport.updateDetail(46);
        passport.getPassportDetails();

        passport.deleteDetail(user);
        passport.getPassportDetails();
    }
}
