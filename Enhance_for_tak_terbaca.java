public class Enhance_for_tak_terbaca {
    public static void main(String[] args) {
        System.out.println("Angka genap dari 0 hingga 10:");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                //Jadi enhance for loop tidak bisa membaca code di atas karena adanya pengubahan indes
                //Kesimpulannya : enhance for loop tidak cocok untuk kasus yang perlu mengubah indeks
                //Tambahan enhance for juga tidak bisa digunakan pada variabel biasa (hanya bisa digunakan pada array)
            }
        }
    }
}
