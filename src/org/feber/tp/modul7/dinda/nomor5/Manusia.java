// package jangan dicatat din
package org.feber.tp.modul7.dinda.nomor5;

public abstract class Manusia {

    protected String nama, alamat, noHp;

    public Manusia(String nama, String alamat, String noHp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public abstract String karakter();
}
