package com.xworkz.xworkzapp.trainee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Trainee {
    private int traineeId;
    private String traineeName;
    private int age;
    private long phoneNumber;
}
