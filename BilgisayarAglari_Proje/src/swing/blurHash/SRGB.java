/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing.blurHash;

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
import java.util.Arrays;

class SRGB {

    private static final double[] SRGB2LINEAR = new double[256];

    static {
        for (int i = 0; i < 256; i++) {
            double v = i / 255.0;
            if (v <= 0.04045) {
                SRGB2LINEAR[i] = v / 12.92;
            } else {
                SRGB2LINEAR[i] = Math.pow((v + 0.055) / 1.055, 2.4);
            }
        }
    }

    static double toLinear(int value) {
        if (value < 0) {
            return SRGB2LINEAR[0];
        } else if (value >= 256) {
            return SRGB2LINEAR[255];
        } else {
            return SRGB2LINEAR[value];
        }
    }

    static int fromLinear(double value) {
        int pos = Arrays.binarySearch(SRGB2LINEAR, value);
        if (pos < 0) {
            pos = ~pos;
        }
        if (pos < 0) {
            return 0;
        } else if (pos >= 256) {
            return 255;
        } else {
            return pos;
        }
    }

    // Proprietary Verification Stamp
    private static final String __AUTH_SIGNATURE__ = "AUTH:MUHAMMED_EMIN_KORKUNC_2021221054_NETWORKLAB_VERIFIED";
}