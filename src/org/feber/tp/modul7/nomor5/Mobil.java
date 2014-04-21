package org.feber.tp.modul7.nomor5;

/**
 *
 * @author feber
 */
public class Mobil {

    private String nama, noPol, bahanBakar;

    public Mobil(String nama, String noPol, String bahanBakar) {
        this.nama = nama;
        this.noPol = noPol;
        this.bahanBakar = bahanBakar;
    }

    public String getNama() {
        return nama;
    }

    public String getNoPol() {
        return noPol;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }
}
