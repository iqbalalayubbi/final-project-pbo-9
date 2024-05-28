/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kel9.fproject;

/**
 * @author x1nx3r
 */
public class WindowStateManager {
    private LoginForm loginForm;
    private DashboardUI dashboardUI;

    public static void main(String[] args){
        WindowStateManager windowManager = new WindowStateManager();
//        windowManager.showLoginForm();
        windowManager.showDashboardUI();
        DatabaseConnect.getConnection();
    }
    
    // Fungsi untuk menampilkan loginForm
    public void showLoginForm(){
        // Buat instance mainUI jika belum ada
        if (loginForm == null){
            loginForm = new LoginForm(this);
        }
        
        // Sembunyikan window dashboardUI
        if (dashboardUI != null){
            dashboardUI.setVisible(false);
        }
        
        // Tampilkan loginForm
        loginForm.setVisible(true);
    }
    
    // Fungsi untuk menampilkan dashboard
    public void showDashboardUI(){
        // Buat instance DashboardUI jika belum ada
        if (dashboardUI == null){
            dashboardUI = new DashboardUI(this);
        }
        
        // Sembunyikan window loginForm
        if (loginForm != null){
            loginForm.setVisible(false);
        }
        
        // Tampilkan dashboardUI
        dashboardUI.setVisible(true);
    }
}

