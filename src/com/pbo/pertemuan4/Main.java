package com.pbo.pertemuan4;

import java.lang.management.ManagementFactory;

//author Frantino Senegal
public class Main {
    public static void main(String[] args) {
        Manajer manajer = new Manajer();
        Pegawai pegawai = new Pegawai();

        manajer.nip  = 21102225;
        manajer.nama = "Frantino";

        pegawai.nip = 123456789;
        pegawai.nama = "Ilyas";

        manajer.showinfo();
        manajer.extrainfo();
        manajer.bonus(1000000);

        pegawai.showinfo();
        pegawai.extrainfo();

    }
}
