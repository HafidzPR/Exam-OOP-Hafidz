// Keamananbank will show error when you extend to Karyawan
public class Manager extends Karyawan {

    public Manager(String idKaryawan) {
        super(idKaryawan);
    }

    // Error: Cannot override the final method from Karyawan
     public String getIdKaryawan() {
        return "TELAH DIUBAH: " + super.getIdKaryawan();
    }
}
