/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

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


import component.Item_People;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;

/**
 *
 * @author muhammedeminkorkunc
 */
public class Menu_Left extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Left
     */
    public Menu_Left() {
        initComponents();
        init();
    }
    
    private void init(){
        sp.setVerticalScrollBar(new ScrollBar());
        menuList.setLayout(new MigLayout("fillx","0[]0","0[]0"));
        showMessage(); 
    }
    
    
    private void showMessage(){ 
        menuList.removeAll();
        //test data
        for(int i=0;i<20;i++){
            menuList.add(new Item_People("People " +i),"wrap ");
        }
        refreshMenuList();
    }
    
    private void showGroup(){
        menuList.removeAll();
        for(int i=0;i<5;i++){
            menuList.add(new Item_People("Group " +i),"wrap ");
        }
        refreshMenuList();
    }
    
    private void showBox(){
        menuList.removeAll();
        for(int i=0;i<10;i++){
            menuList.add(new Item_People("Box " +i),"wrap ");
        }
        refreshMenuList();
    }
    
    private void refreshMenuList(){
        menuList.repaint();
        menuList.revalidate();
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JLayeredPane();
        menuListee = new javax.swing.JLayeredPane();
        menuMessage = new javax.swing.JButton();
        menuGroup = new javax.swing.JButton();
        menuBox = new javax.swing.JButton();
        sp = new javax.swing.JScrollPane();
        menuList = new javax.swing.JLayeredPane();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(244, 244, 244));

        menu.setLayout(new java.awt.GridLayout(1, 0));

        menuListee.setBackground(new java.awt.Color(242, 242, 242));
        menuListee.setOpaque(true);

        menuMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/message_selected.png"))); // NOI18N
        menuMessage.setSelected(true);
        menuMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMessageActionPerformed(evt);
            }
        });

        menuGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/group.png"))); // NOI18N
        menuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupActionPerformed(evt);
            }
        });

        menuBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/box.png"))); // NOI18N
        menuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBoxActionPerformed(evt);
            }
        });

        menuListee.setLayer(menuMessage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menuListee.setLayer(menuGroup, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menuListee.setLayer(menuBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menuListeeLayout = new javax.swing.GroupLayout(menuListee);
        menuListee.setLayout(menuListeeLayout);
        menuListeeLayout.setHorizontalGroup(
            menuListeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuListeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuMessage)
                .addGap(0, 0, 0)
                .addComponent(menuGroup)
                .addGap(0, 0, 0)
                .addComponent(menuBox)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuListeeLayout.setVerticalGroup(
            menuListeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuListeeLayout.createSequentialGroup()
                .addGroup(menuListeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sp.setBackground(new java.awt.Color(242, 242, 242));
        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menuList.setBackground(new java.awt.Color(242, 242, 242));
        menuList.setOpaque(true);

        javax.swing.GroupLayout menuListLayout = new javax.swing.GroupLayout(menuList);
        menuList.setLayout(menuListLayout);
        menuListLayout.setHorizontalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menuListLayout.setVerticalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        sp.setViewportView(menuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuListee)
                    .addComponent(sp))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuListee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMessageActionPerformed
        if(!menuMessage.isSelected()){
            menuMessage.setSelected(true);
            menuGroup.setSelected(false);
            menuBox.setSelected(false);
            showMessage();
        }
    }//GEN-LAST:event_menuMessageActionPerformed

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupActionPerformed
        if(!menuGroup.isSelected()){
            menuMessage.setSelected(false);
            menuGroup.setSelected(true);
            menuBox.setSelected(false);
            showGroup();
        }
    }//GEN-LAST:event_menuGroupActionPerformed

    private void menuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBoxActionPerformed
        if(!menuBox.isSelected()){
            menuMessage.setSelected(false);
            menuGroup.setSelected(false);
            menuBox.setSelected(true);
            showBox();
        }
    }//GEN-LAST:event_menuBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLayeredPane menu;
    private javax.swing.JButton menuBox;
    private javax.swing.JButton menuGroup;
    private javax.swing.JLayeredPane menuList;
    private javax.swing.JLayeredPane menuListee;
    private javax.swing.JButton menuMessage;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables

    // Proprietary Verification Stamp
    private static final String __AUTH_SIGNATURE__ = "AUTH:MUHAMMED_EMIN_KORKUNC_2021221054_NETWORKLAB_VERIFIED";
}
