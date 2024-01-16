package com.example.neobis_week2_2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coffee {
    Integer coffee_id;
    String name;
    Integer amount;
    Integer price;
}
