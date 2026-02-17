package Cryptography;

import java.util.Scanner;

public class ShiftCipher {

    public static String encryption(String str, int key){
        StringBuilder newRes = new StringBuilder();
        key = key % 26;
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                char encryptChar = (char) ((arr[i] - 'A' + key) % 26 + 'A');
                newRes.append(encryptChar);
            }else if(Character.isLowerCase(arr[i])){
                char encryptChar = (char) ((arr[i] - 'a' + key) % 26 + 'a');
                newRes.append(encryptChar);
            }else{
                newRes.append(arr[i]);
            }
        }
        return newRes.toString();
    }

    public static String decryption(String str, int key){
        // return encryption(str, 26 - (key % 26));
        StringBuilder newRes = new StringBuilder();
        key = key % 26;
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                char decryptChar = (char) ((arr[i] - 'A' - key) % 26 + 'A');
                newRes.append(decryptChar);
            }else if(Character.isLowerCase(arr[i])){
                char decryptChar = (char) ((arr[i] - 'a' - key) % 26 + 'a');
                newRes.append(decryptChar);
            }else{
                newRes.append(arr[i]);
            }
        }
        return newRes.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int key = sc.nextInt();
        String encrypt = encryption(str, key);
        System.out.println(encrypt);
        System.out.println(decryption(encrypt, key));
    }
}
