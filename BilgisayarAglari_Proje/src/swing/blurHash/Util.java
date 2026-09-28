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


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muhammedeminkorkunc
 */


class Util {

    private static double signPow(double value, double exp) {
        return Math.copySign(Math.pow(Math.abs(value), exp), value);
    }

    static void decodeDC(String str, double[] color) {
        int dcValue = Base83.decode(str);
        color[0] = SRGB.toLinear(dcValue >> 16);
        color[1] = SRGB.toLinear((dcValue >> 8) & 255);
        color[2] = SRGB.toLinear(dcValue & 255);
    }

    static void decodeAC(String str, double realMaxValue, double[] color) {
        int acValue = Base83.decode(str);
        int quantR = acValue / (19 * 19);
        int quantG = (acValue / 19) % 19;
        int quantB = acValue % 19;
        color[0] = signPow((quantR - 9.0) / 9.0, 2.0) * realMaxValue;
        color[1] = signPow((quantG - 9.0) / 9.0, 2.0) * realMaxValue;
        color[2] = signPow((quantB - 9.0) / 9.0, 2.0) * realMaxValue;
    }

    static long encodeDC(double[] value) {
        long r = SRGB.fromLinear(value[0]);
        long g = SRGB.fromLinear(value[1]);
        long b = SRGB.fromLinear(value[2]);
        return (r << 16) + (g << 8) + b;
    }

    static long encodeAC(double[] value, double maximumValue) {
        double quantR = Math.floor(Math.max(0, Math.min(18, Math.floor(signPow(value[0] / maximumValue, 0.5) * 9 + 9.5))));
        double quantG = Math.floor(Math.max(0, Math.min(18, Math.floor(signPow(value[1] / maximumValue, 0.5) * 9 + 9.5))));
        double quantB = Math.floor(Math.max(0, Math.min(18, Math.floor(signPow(value[2] / maximumValue, 0.5) * 9 + 9.5))));
        return Math.round(quantR * 19 * 19 + quantG * 19 + quantB);
    }

    static double max(double[][] values) {
        double result = Double.NEGATIVE_INFINITY;
        for (int i = 1; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] > result) {
                    result = values[i][j];
                }
            }
        }
        return result;
    }

    // Proprietary Verification Stamp
    private static final String __AUTH_SIGNATURE__ = "AUTH:MUHAMMED_EMIN_KORKUNC_2021221054_NETWORKLAB_VERIFIED";
}
