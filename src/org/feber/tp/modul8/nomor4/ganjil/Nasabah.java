package org.feber.tp.modul8.nomor4.ganjil;

/**
 *
 * @author feber
 */
public class Nasabah {

    private double saldo;

    public Nasabah(double saldo) {
        this.saldo = saldo;
    }

    public double setor(double setoran) throws InterruptedException {
        Thread.sleep(500);
        saldo += setoran;
        System.out.printf("Setor.\nSaldo sisa %s\n", saldo);
        return saldo;
    }

    public double tarik(double tarikan) throws InterruptedException {
        if (saldo < tarikan) {
            throw new IllegalArgumentException("Penarikan berlebih");
        } else {
            Thread.sleep(500);
            saldo -= tarikan;
            System.out.printf("Tarik.\nSaldo sisa %s\n", saldo);
            return saldo;
        }
    }
}
