package com.xworkz.xworkzapp.xworkz;

import com.xworkz.xworkzapp.trainee.Trainee;

public interface Xworkz {
   boolean addTrainee(Trainee trainee);
   void getAllDetails();
   boolean updateTrainee(long phoneNumber);
   boolean deleteTrainee(Trainee trainee);
}
