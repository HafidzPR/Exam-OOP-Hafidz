// Interface PengirimPesan dengan method default
public interface PengirimPesan {

    // Method kirimPesan()
     default void kirimPesan(String pesan) {
        System.out.println("Mengirim pesan: " + pesan);

    }
}
