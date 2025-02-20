public class MainOOP extends KeamananBank{
    public static void main(String[] args) {

        // Object KeamananBank
        KeamananBank keamanan = new KeamananBank();
        keamanan.tampilkanKeamanan();
        //=========================================================================//
        // Object Karyawan
        Karyawan karyawan = new Karyawan("Udin bin Suparman");
        System.out.println("ID Karyawan: " + karyawan.getIdKaryawan());
        //=========================================================================//
        // Object Manager
        Manager manager = new Manager("Thomas Riveager");
        System.out.println("ID Manager, " + manager.getIdKaryawan());
        //=========================================================================//
        // Object Mobil
        Mobil mobil1 = new Mobil();
        // Panggil method buatMesin() untuk buat mesin & mennyalakan
        mobil1.buatMesin();
        //=========================================================================//
        // Anonymous class
        PengirimPesan pengirim = new PengirimPesan() {

            @Override
            public void kirimPesan(String pesan) {
                System.out.println("Mengirim Pesan: " + pesan);
            }
        };
        // Panggil method kirimPesan()
        pengirim.kirimPesan("Halo, ini dari Anonymous Class");

    }
}

