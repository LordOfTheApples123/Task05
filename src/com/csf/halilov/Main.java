package com.csf.halilov;

import java.util.Scanner;

public class Main {

    public static void out(String s) {
        System.out.print(s);
    }

    public static void outln(String s) {
        System.out.println(s);
    }

    public static void FirstAndLastLine(int w) {
        out("+");
        for (int i = 1; i <= w - 2; i++) {
            out("-");
        }
        if (w != 1) {
            out("+");
        }
        outln("");
    }

    public static void MainLines(int w, int s){
        int k = 0;
        out("|");
        while (k != w - 2) {
            for (int i = 1; i <= s; i++) {
                if (k == w - 2) {
                    break;
                }
                out("*");
                k++;
            }
            for (int i = 1; i <= s; i++) {
                if (k == w + 2) {
                    break;
                }
                out(" ");
                k++;
            }
        }
        if(w!= 1){
            out("|");
        }
        outln("");
    }

    public static void SideLines(int w, int s){
        int k = 0;
        out("|");
        while (k != w - 2) {
            for (int i = 1; i <= s; i++) {
                if (k == w + 2) {
                    break;
                }
                out(" ");
                k++;
            }
            for (int i = 1; i <= s; i++) {
                if (k == w - 2) {
                    break;
                }
                out("*");
                k++;
            }
        }
        if(w!=1){
            out("|");
        }
        outln("");
    }

    public static void main(String[] args) {
        int w, s, h, k;
        out("Введите переменные в порядке W S H>> ");
        Scanner in = new Scanner(System.in);
        w = in.nextInt();
        s = in.nextInt();
        h = in.nextInt();
        FirstAndLastLine(w);
        k = 0;
        if(h !=1){
            while (k != h + 2) {
                for (int i = 1; i <= s; i++) {
                    if (k == h - 2) {
                        break;
                    }
                    MainLines(w, s);
                    k++;
                }
                for(int i = 1; i <= s; i++){
                    if (k == h - 2) {
                        break;
                    }
                    SideLines(w, s);
                    k++;
                }
            }
            FirstAndLastLine(w);
        }
    }
}
