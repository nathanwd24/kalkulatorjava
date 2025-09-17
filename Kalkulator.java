import java.util.Scanner;

class Kalkulator {
    public static void main(String[] args) {
        Angka angka = new Angka();
        Scanner input = new Scanner(System.in);
        System.out.println("============ KALKULATOR ============");

        System.out.print("Masukkan angka pertama : ");
        angka.a = input.nextDouble();
        System.out.println("Angka pertama : " + angka.a);

        System.out.print("Masukkan angka kedua : ");
        angka.b = input.nextDouble();
        System.out.println("Angka kedua : " + angka.b);
        
        angka.tambah = angka.a+angka.b;
        angka.kali = angka.a*angka.b;
        angka.kurang = angka.a-angka.b;
        angka.bagi = angka.a/angka.b;

        System.out.println("1. Tambah");
        System.out.println("2. Kali");
        System.out.println("3. Kurang");
        System.out.println("4. Bagi");
        System.out.print("Pilihan : ");
        angka.pilihan = input.nextInt();
        
        switch (angka.pilihan) {
            case 1:
                System.out.print(angka.a + " + " + angka.b + " = " + angka.tambah);
                break;
            case 2:
                System.out.print(angka.a + " * " + angka.b + " = " + angka.kali);
                break;
            case 3:
                System.out.print(angka.a + " - " + angka.b + " = " + angka.kurang);
                break;
            case 4:
                System.out.print(angka.a + " / " + angka.b + " = " + angka.bagi);
                break;
            default:
            System.err.println("Pilihan tidak ada!");
        }

        input.close();
    }
}