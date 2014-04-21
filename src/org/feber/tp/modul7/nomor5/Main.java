package org.feber.tp.modul7.nomor5;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author feber
 */
public class Main {

    public static void main(String[] args) throws DocumentException, FileNotFoundException  {
        Pemilik p = new Pemilik("Hagi", "Serang", "0856*",
                new Mobil("Lancer", "A 666 AI", "Pertamax Plus"));
        

        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream(new File("1103124305.pdf")));
        doc.open();
        doc.add(new Paragraph("TP Modul 7 - sensor - IF 36 05"));
        doc.add(new Paragraph("##################################"));
        doc.add(new Paragraph("Data Owner"));
        doc.add(new Paragraph("Nama: " + p.getNama()));
        doc.add(new Paragraph("Alamat: " + p.getAlamat()));
        doc.add(new Paragraph("No HP: " + p.getNoHp()));
        doc.add(new Paragraph("Karakter: " + p.karakter()));
        doc.add(new Paragraph("Detail Kendaraan"));
        doc.add(new Paragraph("Tipe: " + p.getMobil().getNama()));
        doc.add(new Paragraph("Nomor polisi: " + p.getMobil().getNoPol()));
        doc.add(new Paragraph("Bahan bakar: " + p.getMobil().getBahanBakar()));
        doc.add(new Paragraph("##################################"));
        doc.close();
    }
}
