public class Kafe16kedua {
    public static void Menu(String namaPelanggan, boolean isMember) {

        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembeliant");
        
        }
        
        System.out.println("===== MENU RESTO KAFE =====");
        
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000"); 
        System.out.println("3. Latte - Rp22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");       
        System.out.println("6. Mie Goreng - 18.200");
        System.out.println("===========================");       
        System.out.println("Silakan pilih menu yang Anda inginkan.");
        }
        public static void main(String[] args) {
            Menu("Andi", true);
        }
}
