package com.xworkz.passportapp.passport.impl;

import com.xworkz.passportapp.passport.Passport;
import com.xworkz.passportapp.user.User;

public class PassportImpl implements Passport {
   User user;

    @Override
    public boolean addDetails(User user) {
    boolean   isAdded=false;

        if (user!=null){
          this.user=user;
          isAdded=true;
        }
        return isAdded;
    }

    @Override
    public void getPassportDetails() {
        System.out.println(user);
    }

    @Override
    public boolean updateDetail(int userAge) {

        System.out.println("update product started");
        boolean isUpdated = false;
        if(user!=null) {
            user.setUserAge(userAge);
            isUpdated=true;
        }else System.out.println("improper data found");

        System.out.println("update product ended");
        return isUpdated;
    }

    @Override
    public boolean deleteDetail(User user) {
        System.out.println("delete product started");
        boolean isDeleted =false;
        if (user!=null) {
            this.user = null;
            isDeleted =true;
        }
        else System.out.println("no data to delete");

        System.out.println("delete product ended");
        return isDeleted;
    }
}
