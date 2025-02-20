// Dont extend Karyawan to KeamananBank to prevent error
public class Karyawan {
    private String idKaryawan;

    // Constructor
    public Karyawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    // Final Method
    String getIdKaryawan() {
        return idKaryawan;
    }
}