package com.example.neobis_week2_2;

import com.example.neobis_week2_2.models.Coffee;
import com.example.neobis_week2_2.models.Users;

import java.sql.*;


public class NeobisWeek22Application {

    public static void main(String[] args) {
        Connector connector = new Connector();
        String queryForUsers = "SELECT * FROM Users";
        String queryForCoffee = "SELECT * FROM Coffee";
        try {
            Statement statement = connector.getConnection().createStatement();
            ResultSet resultSet1 = statement.executeQuery(queryForUsers);
            while (resultSet1.next()){
                Users users = new Users();
                users.setUser_id(resultSet1.getInt("user_id"));
                users.setFirstName(resultSet1.getString("firstname"));
                users.setSecondName(resultSet1.getString("secondname"));
                users.setAge(resultSet1.getInt("age"));
                users.setEmail(resultSet1.getString("email"));
                users.setMobNum(resultSet1.getString("mobnum"));
                users.setPassword(resultSet1.getString("password"));
                System.out.println(users);
            }
            ResultSet resultSet2 = statement.executeQuery(queryForCoffee);
            while (resultSet2.next()){
                Coffee coffee = new Coffee();
                coffee.setCoffee_id(resultSet2.getInt("coffee_id"));
                coffee.setName(resultSet2.getString("coffee_name"));
                coffee.setAmount(resultSet2.getInt("amount"));
                coffee.setPrice(resultSet2.getInt("price"));
                System.out.println(coffee);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
