package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.trainee.Trainee;
import com.xworkz.xworkzapp.xworkz.Xworkz;
import com.xworkz.xworkzapp.xworkz.impl.XworkzImpl;

import java.util.Scanner;

public class XworkzRunner {
    public static void main(String[] args) {

        Xworkz xworkz = new XworkzImpl();
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 3; index++) {
            Trainee trainee = new Trainee();
            System.out.println("Enter trainee id ");
            int traineeId = scanner.nextInt();
            trainee.setTraineeId(traineeId);

            System.out.println("enter name :");
            String traineeName = scanner.next();
            trainee.setTraineeName(traineeName);

            System.out.println("enter age :");
            int traineeAge = scanner.nextInt();
            trainee.setAge(traineeAge);

            System.out.println("enter phone number :");
            long traineeNumber = scanner.nextLong();
            trainee.setPhoneNumber(traineeNumber);

            boolean traineeAdded=xworkz.addTrainee(trainee);

            System.out.println(" is Patient added "+ traineeAdded);
        }

       xworkz.getAllDetails();

}}
