import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat, kim, fiz, tur, muz, ortalama, ders=0,toplam=0;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat= scanner.nextDouble();
        if (mat>=0&&mat<=100){
            ders++;
            toplam+=mat;
        }
        else System.out.println("Girdiğiniz not geçersizdir, bundan dolayı ortalama hesabına eklenmeyecektir.");
        System.out.print("Kimya notunuzu giriniz: ");
        kim= scanner.nextDouble();
        if (kim>=0&&kim<=100){
            ders++;
            toplam+=kim;
        }
        else System.out.println("Girdiğiniz not geçersizdir, bundan dolayı ortalama hesabına eklenmeyecektir.");
        System.out.print("Fizik notunuzu giriniz: ");
        fiz= scanner.nextDouble();
        if (fiz>=0&&fiz<=100){
            ders++;
            toplam+=fiz;
        }
        else System.out.println("Girdiğiniz not geçersizdir, bundan dolayı ortalama hesabına eklenmeyecektir.");
        System.out.print("Türkçe notunuzu  giriniz: ");
        tur=scanner.nextDouble();
        if (tur>=0&&tur<=100){
            ders++;
            toplam+=tur;
        }
        else System.out.println("Girdiğiniz not geçersizdir, bundan dolayı ortalama hesabına eklenmeyecektir.");
        System.out.print("Müzik notunuzu giriniz: ");
        muz= scanner.nextDouble();
        if (muz>=0&&muz<=100){
            ders++;
            toplam+=muz;
        }
        else System.out.println("Girdiğiniz not geçersizdir, bundan dolayı ortalama hesabına eklenmeyecektir.");
        scanner.close();
        if (ders!=0) {
            ortalama = toplam / ders;
            if (ortalama >= 55) {
                System.out.println("Sınıfı geçtiniz");
            }
            else if (ortalama < 55) {
                System.out.println("Sınıfta kaldınız!");
            }
        }
        else System.out.println("Girdiğiniz tüm notlar geçersiz aralıktadır!");
    }
}