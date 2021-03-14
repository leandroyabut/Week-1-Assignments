package com.leandroyabut.weekendassignment.singleton;

import java.math.BigDecimal;
import java.sql.*;


public class SampleSingleton {

    private static SampleSingleton instance = null;

    private SampleSingleton() {} // Private Constructor

    public static SampleSingleton getInstance() {
        if(instance == null) {
            synchronized (SampleSingleton.class) {
                if(instance == null) {
                    instance = new SampleSingleton();
                }
            }
        }
        return instance;
    }

    public void databaseQuery(BigDecimal input) {
        try(Connection conn = DriverManager.getConnection("url of database")) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select id from table");
            double x = 0;
            while (rs.next()) {
                x = rs.getInt(1) * input.doubleValue();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
