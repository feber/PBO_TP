// package jangan dicatat din
package org.feber.tp.modul7.dinda.nomor4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Driver {

    public static void main(String[] args) throws IOException {
        Penyanyi penyanyi = new Penyanyi("Sunny", "Girls Generation");
        String print = "Penyanyi : " + penyanyi.getNama() + "\nBand : " + penyanyi.getBand();
        File sumber = new File("something.dat");
        if (!sumber.exists()) {
            sumber.createNewFile();
        }
        PrintWriter printWriter = new PrintWriter(sumber);
        printWriter.print(print);
        printWriter.close();
        BufferedReader br = new BufferedReader(new FileReader(sumber));
        String temp = "";
        print = "";
        while ((temp = br.readLine()) != null) {
            print += temp + "\n";
        }
        printWriter = new PrintWriter("DindaGazella.dat");
        printWriter.print(print);
        printWriter.close();
    }
}
