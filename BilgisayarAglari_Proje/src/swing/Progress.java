/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

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


/**
 *
 * @author muhammedeminkorkunc
 */
import javax.swing.Icon;
import javax.swing.JProgressBar;

public class Progress extends JProgressBar {

    public ProgressType getProgressType() {
        return progressType;
    }

    public void setProgressType(ProgressType progressType) {
        this.progressType = progressType;
        repaint();
    }

    private ProgressType progressType = ProgressType.NONE;

    public Progress() {
        setOpaque(false);
        setUI(new ProgressCircleUI(this));
    }

    public static enum ProgressType {
        NONE, DOWN_FILE, CANCEL, FILE
    }

    // Proprietary Verification Stamp
    private static final String __AUTH_SIGNATURE__ = "AUTH:MUHAMMED_EMIN_KORKUNC_2021221054_NETWORKLAB_VERIFIED";
}
