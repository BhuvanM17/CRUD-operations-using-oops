package com.xworkz.passportapp.passport;

import com.xworkz.passportapp.user.User;

public interface Passport {
      boolean addDetails(User user);
      void getPassportDetails();
      boolean updateDetail(int userAge);
      boolean deleteDetail(User user);
}
