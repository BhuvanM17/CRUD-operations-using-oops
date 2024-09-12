package com.xworkz.xworkzapp.xworkz.impl;

import com.xworkz.xworkzapp.trainee.Trainee;
import com.xworkz.xworkzapp.xworkz.Xworkz;

public class XworkzImpl implements Xworkz {
    Trainee[] trainee = {null,null,null} ;
    int index;
    @Override
    public boolean addTrainee(Trainee trainee) {
        boolean isAdded = false;
        if(trainee!=null){
            this.trainee[index++]=trainee;
            isAdded = true;
        }else System.out.println("please enter details correctly");
        return isAdded;
    }

    @Override
    public void getAllDetails() {
        System.out.println("get method started");
        for (Trainee trainee : trainee){
            System.out.println(trainee);
        }
    }

    @Override
    public boolean updateTrainee(long phoneNumber) {

//        System.out.println("update product started");
//        boolean isUpdated = false;
//        if(trainee!=null) {
//            trainee.setPhoneNumber(phoneNumber);
//            isUpdated=true;
//        }else System.out.println("improper data found");
//
//        System.out.println("update product ended");
//
//
return true;
    }

    @Override
    public boolean deleteTrainee(Trainee trainee) {
        System.out.println("delete product started");
        boolean isDeleted =false;
        if (trainee!=null) {
            this.trainee = null;
            isDeleted =true;


        }
        else System.out.println("no data to delete");

        System.out.println("delete product ended");
        return isDeleted;

    }
}
