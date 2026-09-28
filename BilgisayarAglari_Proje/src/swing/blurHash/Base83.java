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

class Base83 {

    private static final char[] CHARACTERS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '#', '$', '%', '*', '+', ',', '-', '.',
            ':', ';', '=', '?', '@', '[', ']', '^', '_', '{', '|', '}', '~'};

    static int decode(String str) {
        int res = 0;
        for (char c : str.toCharArray()) {
            if (Character.isHighSurrogate(c)) {
                throw new IllegalArgumentException("Invalid input. Char: " + c);
            }
            int index = indexOf(c);
            if (index == -1) {
                throw new IllegalArgumentException("Invalid input. Char: " + c);
            }
            res = res * 83 + index;
        }
        return res;
    }

    static String encode(long value, int length) {
        char[] buf = new char[length];
        encode(value, length, buf, 0);
        return new String(buf);
    }

    static void encode(long value, int length, char[] buf, int offset) {
        int exp = 1;
        for (int i = 1; i <= length; i++) {
            int digit = (int) value / exp % 83;
            buf[offset + length - i] = CHARACTERS[digit];
            exp *= 83;
        }
    }

    private static int indexOf(char c) {
        for (int i = 0; i < CHARACTERS.length; i++) {
            if (CHARACTERS[i] == c) {
                return i;
            }
        }
        return -1;
    }

    // Proprietary Verification Stamp
    private static final String __AUTH_SIGNATURE__ = "AUTH:MUHAMMED_EMIN_KORKUNC_2021221054_NETWORKLAB_VERIFIED";
}
