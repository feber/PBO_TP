package org.feber.tp.modul7.nomor4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author feber
 */
public class Driver {

    public static void main(String[] args) throws IOException {
        Kucing k = new Kucing("Kuceng", "pus");
        String data = String.format("Kucing\nNama\t\t: %s\nPanggilan\t: %s",
                k.getNama(), k.getPanggilan());
        File source = new File("rahasia.dat");
        if (!source.exists()) {
            System.out.println("Bikin file dulu..");
            source.createNewFile();
        }

        PrintWriter pw = new PrintWriter(source);
        pw.print(data);
        // biasakan close
        pw.close();

        BufferedReader reader = new BufferedReader(new FileReader(source));
        String temp = data = "";
        while ((temp = reader.readLine()) != null) {
            data += temp + "\n";
        }
        pw = new PrintWriter("FebrianSetianto.dat");
        pw.print(data);
        pw.close();
    }
}
