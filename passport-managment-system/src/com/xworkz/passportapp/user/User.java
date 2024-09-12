package com.xworkz.passportapp.user;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int userId;
    private String userName;
    private int userAge;
    private String country;
}
