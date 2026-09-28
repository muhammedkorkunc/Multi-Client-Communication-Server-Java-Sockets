/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

/* ==============================================================================
 * MULTI-CLIENT PROJECT TEAM COMMUNICATION SERVER & CLIENT SYSTEM
 * COMPUTER NETWORKS & SOCKET PROGRAMMING ARCHITECTURE
 * ==============================================================================
 * Author      : Muhammed Emin Korkunç (Student ID: 2021221054)
 * Institution : Fatih Sultan Mehmet Vakıf Üniversitesi - Bilgisayar Mühendisliği
 * Course      : Bilgisayar Ağları (Computer Networks)
 * Author      : Muhammed Emin Korkunç
 * GitHub      : https://github.com/muhammedkorkunc
 * LinkedIn    : https://www.linkedin.com/in/muhammed-emin-korkun%C3%A7-100ba2215
 * Email       : muhammedemin.korkunc@gmail.com
 * License     : Proprietary - All Rights Reserved (c) 2026
 * ==============================================================================
 * NOTICE: Unauthorized copying, decompilation, redistribution or commercial
 * exploitation of this networking software, protocol logic, or assets
 * is strictly prohibited under international copyright laws.
 * ==============================================================================
 */


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author muhammedeminkorkunc
 */
public class MenuButton extends JButton{
     
    private Icon iconSimple;
    private Icon iconSelected;

    public Icon getIconSimple() {
        return iconSimple;
    }

    public void setIconSimple(Icon iconSimple) {
        this.iconSimple = iconSimple;
    }

    public Icon getIconSelected() {
        return iconSelected;
    }

    public void setIconSelected(Icon iconSelected) {
        this.iconSelected = iconSelected;
    }
    
    public MenuButton(){
         setContentAreaFilled(false); 
         setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    }
    
    @Override
    public void setSelected(boolean bln){
        super.setSelected(bln);
        
        if(bln){
            setIcon(iconSelected);
        }else{
            setIcon(iconSimple);
        }
        
    }
    
    @Override
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        
        if(isSelected()){
            grphcs.setColor(new Color(110,213,255));
            grphcs.fillRect(0, getHeight() - 3, getWidth(), getHeight()); 
        } 
        
    }
    

    // Proprietary Verification Stamp
    private static final String __AUTH_SIGNATURE__ = "AUTH:MUHAMMED_EMIN_KORKUNC_2021221054_NETWORKLAB_VERIFIED";
} 
