import java.util.Scanner;

public class FindContact{
    public static void main(String[]
        args) {
        
        // menyimpan data contact:
        // index 0 = nomor telpon
        // index 1 = nama
        // index 2 = nama club
        String[][] data = {
            {"08123123121", "Lionel Messi", "Barcelona"},
            {"08123123122", "Christiano Ronaldo", "Real Madrid"},
            {"08123123123", "Ricardo Kaka", "Ac Milan"}, 
            {"08123123124", "Karim Benzema", "Real Madrid"}, 
            {"08123123125", "de Gea", "Menchester United"}
        };
          // Membuat Scanner untuk menerima input dari user
        Scanner scanner = new Scanner(System.in);

        // Meminta user memasukkan nama atau club yang ingin dicari
        System.out.print("Masukkan nama/club yang dicari: ");

        // Mengubah input menjadi lowercase agar pencarian
        // tidak membedakan huruf besar dan huruf kecil
        String keyword = scanner.nextLine().toLowerCase();

        // Variable untuk mengecek apakah data ditemukan
        boolean found = false;

        // Melakukan pengecekan terhadap seluruh data contact
        for (int i = 0; i < data.length; i++) {

            // Mengambil nomor, nama, dan club dari data saat ini
            String phone = data[i][0];
            String name = data[i][1];
            String club = data[i][2];

            // Mengecek apakah keyword terdapat pada nama
            // ATAU terdapat pada nama club
            if (name.toLowerCase().contains(keyword)
                    || club.toLowerCase().contains(keyword)) {

                // Jika ditemukan, tampilkan data contact
                System.out.println(
                    phone + " - " + name + " - " + club
                );

                // Menandakan bahwa minimal satu data ditemukan
                found = true;
            }
        }

        // Jika setelah seluruh data dicek tidak ada yang cocok
        if (!found) {
            System.out.println("Data tidak ditemukan.");
        }

        // Menutup Scanner setelah selesai digunakan
        scanner.close();
    }
}