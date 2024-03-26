public class Enhance_if {
    public static void main(String[] args) {
        int  angka = 1;
        int sum = 2;
        String pesan = (angka != sum) ? "angka tidak sama" : "angka sama"; 
        //Jadi pada enhance if dapa terbaca seperti ini : 
        //- Variabel pesan berfungsi menyimpan pesan yang akan diberitahu ke terminal
        //- (angka != sum) berfungsi sebagai kondisi yang dipenuhi 
        // "?" dapat diartikan sebagai penentu eksekusi atau mungkin saya rasa bisa disebut penentu booleannya
        // "angka tidak sama" : "angka sama"; berfungsi sebagai True : False mungkin bisa disebut jika True akan di baca "angka tidak sama" jika false di baca "angka sama" sesua dengan kondisi yag diberikan
        System.out.println("Jadi keadaannya : " + pesan);
    }
}
