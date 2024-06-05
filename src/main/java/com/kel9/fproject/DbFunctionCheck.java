/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kel9.fproject;

/**
 *
 * @author x1nx3r
 */
public class DbFunctionCheck {
    public static void main(String[] args) {
        String username = "testuser";
        String password = "testpassword";
        if (DatabaseConnect.authenticate(username, password)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed!");
        }
    }
}
