/*
//simplecolumnarcipher:-
package com.mycompany.railfence;
import java.util.*;

public class Simplecolumnarcipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plaintext : ");
        String message = sc.nextLine();
        System.out.println("Enter key in number : ");
        String key = sc.nextLine();
        int columnCount = key.length();
        int rowCount = (message.length() + columnCount - 1) / columnCount;
        int plainText[][] = new int[rowCount][columnCount];
        int cipherText[][] = new int[rowCount][columnCount];
        System.out.print("\n Encryption");
        cipherText = encrypt(plainText, cipherText, message, rowCount, columnCount, key
        );
        String ct = "";
        for (int i = 0; i < columnCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                if (cipherText[j][i] == 0) {
                    ct = ct + 'x';
                } else {
                    ct = ct + (char) cipherText[j][i];
                }
            }
        }
        System.out.print("\n Cipher Text : " + ct.toString());
        System.out.print("\n Decryption");
        plainText = decrypt(plainText, cipherText, ct, rowCount, columnCount, key);
        String pt = "";
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (plainText[i][j] == 0) {
                    pt = pt + "";
                } else {
                    pt = pt + (char) plainText[i][j];
                }
            }
        }
        System.out.print("Plain text : " + pt);
        System.out.println();
    }

    static int[][] encrypt(int plainText[][], int cipherText[][], String message, int rowCount, int columnCount, String key) {
        int i, j;
        int k = 0;
        for (i = 0; i < rowCount; i++) {
            for (j = 0; j < columnCount; j++) {
                if (k < message.length()) {
                    plainText[i][j] = (int) message.charAt(k);
                    k++;
                } else {
                    plainText[i][j] = 'x';
                }
            }
        }
        for (i = 0; i < columnCount; i++) {
            int currentCol = ((int) key.charAt(i) - 48) - 1;
            for (j = 0; j < rowCount; j++) {
                cipherText[j][i] = plainText[j][currentCol];
            }
        }
        System.out.print("Cipher array \n");
        for (i = 0; i < rowCount; i++) {
            for (j = 0; j < columnCount; j++) {
                System.out.print((char) cipherText[i][j] + "");
            }
            System.out.println();
        }
        return cipherText;
    }

    static int[][] decrypt(int plainText[][], int cipherText[][], String message, int rowCount, int columnCount, String key) {
        int i, j;
        for (i = 0; i < columnCount; i++) {
            int currentCol = ((int) key.charAt(i) - 48) - 1;
            for (j = 0; j < rowCount; j++) {
                plainText[j][currentCol] = cipherText[j][i];
            }
        }
        System.out.print("Plain array \n");
        for (i = 0; i < rowCount; i++) {
            for (j = 0; j < columnCount; j++) {
                System.out.print((char) plainText[i][j] + "\t");
            }
            System.out.println();
        }
        return plainText;
//      --attackpostponeduntiltwoam
//      --4312567
    }
}


*/

//-----------------------------------------------------------------------------------------------------------------------------------------------


/*

//vernamecipher:-


package com.mycompany.railfence;
import java.util.Scanner;

public class VernamCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String txt = sc.nextLine();
        System.out.println("Enter OTP(One-Time Pad): ");
        String otp = sc.nextLine();
        String st = "";
        char m, n;
        int p1 = 0, p2 = 2;
        char c[] = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int n1[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        if (txt.length() != otp.length()) {
            System.out.println("Please enter OTP as the same length of string : ");
            otp = sc.nextLine();
        }
        for (int i = 0; i < txt.length(); i++) {
            m = (char) (txt.charAt(i));
            n = (char) (otp.charAt(i));
            for (int j = 0; j < c.length; j++) {
                if (m == c[j]) {
                    p1 = n1[j];
                }
                if (n == c[j]) {
                    p2 = n1[j];
                }
            }
            int p = p1 + p2;
            System.out.println(p1 + "+" + p2 + "=");
            System.out.println(p);
            if (p >= 26) {
                p = p - 26;
            }
            char c1 = c[p];
            System.out.println("\n\tCHARACTER at " + p + " is " + c1);
            st = st + c1;
        }
        System.out.println("_______________");
        System.out.println("Cipher text is : " + st);
//      --howareyou
//      --ncbtzqarx
    }
}
*/

//--------------------------------------------------------------------------------------------------------------------------

/*

//Rail Fence Cipher :-

package com.mycompany.railfence;

public class Railfence {

    public static void main(String[] args) {
        String input = "meetmeafterthetogaparty";
        String output = "";
        int len = input.length();
        int flag = 0;
        System.out.println("Input string : " + input);
        for (int i = 0; i < len; i += 2) {
            output += input.charAt(i);
        }
        for (int i = 1; i < len; i += 2) {
            output += input.charAt(i);
        }
        System.out.println("Ciphered Text : " + output);
    }
}

*/