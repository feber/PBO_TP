package org.feber.tp.modul7.nomor5;

/**
 *
 * @author feber
 */
public class Pemilik extends Manusia {

    private Mobil mobil;

    public Pemilik(String nama, String alamat, String noHp, Mobil mobil) {
        super(nama, alamat, noHp);
        this.mobil = mobil;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void addMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    @Override
    public String karakter() {
        return "Bijaksana";
    }
}
