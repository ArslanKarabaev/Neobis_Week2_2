package com.example.neobis_week2_2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users extends Coffee {
    Integer user_id;
    String firstName;
    String secondName;
    Integer age;
    String email;
    String mobNum;
    String password;
}
