package org.feber.tp.modul8.nomor4.genap;

/**
 *
 * @author feber
 */
public class Peminjam {

    private double pinjaman;

    public Peminjam(double pinjaman) {
        this.pinjaman = pinjaman;
    }

    public synchronized double meminjam(double pinjaman) throws InterruptedException {
        Thread.sleep(500);
        pinjaman += pinjaman;
        System.out.printf("Minjam.\nPinjaman sisa %s\n", pinjaman);
        return pinjaman;
    }

    public synchronized double mengembalikan(double bayaran) throws InterruptedException {
        if (pinjaman < bayaran) {
            throw new IllegalArgumentException("Pengembalian berlebih");
        } else {
            Thread.sleep(500);
            pinjaman -= bayaran;
            System.out.printf("Bayar.\nPinjaman sisa %s\n", pinjaman);
            return pinjaman;
        }
    }
}
