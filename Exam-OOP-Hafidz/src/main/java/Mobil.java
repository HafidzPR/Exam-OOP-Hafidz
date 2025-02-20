public class Mobil {

    // Inner class Mesin
    class Mesin {

        // Method untuk menyalakan mesin
        public void nyalakanMesin() {
            System.out.println("Mesin menyala...");
        }
    }

    // Method untuk membuat objek Mesin dan menyalakan mesin
    public void buatMesin() {

        Mesin mesin = new Mesin();      // Membuat object inner class
        mesin.nyalakanMesin();          // Memanggil Method nyalakanMesin()
    }

}

