import java.util.Scanner;

class Kalkulator {
    public static void main(String[] args) {
        Angka number = new Angka();
        Scanner input = new Scanner(System.in);
        System.out.println("============ KALKULATOR ============");

        System.out.print("Masukkan angka pertama : ");
        number.a = input.nextDouble();
        System.out.println("Angka pertama : " + number.a + "\n");

        System.out.print("Masukkan angka kedua : ");
        number.b = input.nextDouble();
        System.out.println("Angka kedua : " + number.b + "\n");

        System.out.println("Pilih operasi perhitungan");
        System.out.println("1. Tambah");
        System.out.println("2. Kali");
        System.out.println("3. Kurang");
        System.out.println("4. Bagi");
        System.out.print("Pilihan : ");
        number.pilihan = input.nextInt();
        
        switch (number.pilihan) {
            case 1:
                number.tambah(number.a, number.b);
                break;
            case 2:
                number.kali(number.a, number.b);
                break;
            case 3:
                number.kurang(number.a, number.b);
                break;
            case 4:
                number.bagi(number.a, number.b);
                break;
            default:
            System.err.println("Pilihan tidak ada!");
        }

        input.close();
    }
} // Nathanael Widayaka (2407421029) - TMJ 3B - 18/09/2025