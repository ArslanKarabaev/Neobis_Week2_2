package com.example.neobis_week2_2;

import lombok.Getter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private final String db_url = "jdbc:postgresql://localhost:5432/neo_2_DB";
    private final String db_user = "postgres";
    private final String db_password = "Arspostgres";
    @Getter
    private Connection connection;
   public Connector() {
        try {
            connection = DriverManager.getConnection(db_url, db_user, db_password);
        } catch (SQLException e) {
            System.out.println("Error");
        }
   }

}
