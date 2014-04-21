// package jangan dicatat din
package org.feber.tp.modul7.dinda.nomor5;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws DocumentException, FileNotFoundException {
        Pemilik pemilik = new Pemilik("Dinda Gazella", "Bandung", "0856*",
                new Mobil("Yamaha Mio", "D 6850 GE", "Pertamax"));

        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("1103120229.pdf"));
        document.open();
        document.add(new Paragraph("TP Modul 7 - sensor - IF 36 05"));
        document.add(new Paragraph("=================================="));
        document.add(new Paragraph("Data Owner"));
        document.add(new Paragraph("Nama: " + pemilik.getNama()));
        document.add(new Paragraph("Alamat: " + pemilik.getAlamat()));
        document.add(new Paragraph("No HP: " + pemilik.getNoHp()));
        document.add(new Paragraph("Karakter: " + pemilik.karakter()));
        document.add(new Paragraph("Detail Kendaraan"));
        document.add(new Paragraph("Tipe: " + pemilik.getMobil().getNama()));
        document.add(new Paragraph("Nomor polisi: " + pemilik.getMobil().getNoPol()));
        document.add(new Paragraph("Bahan bakar: " + pemilik.getMobil().getBahanBakar()));
        document.add(new Paragraph("=================================="));
        document.close();
    }
}
