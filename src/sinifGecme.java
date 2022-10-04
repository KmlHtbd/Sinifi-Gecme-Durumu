import java.util.Scanner;
public class sinifGecme {
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz, avr;
        int dersSayisi = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        if(!(mat <= 0 || mat > 100)) {
            total += mat;
            dersSayisi++;
        }

        System.out.print("Fizik Notunuzu Giriniz: ");
        fiz = input.nextInt();
        if(!(fiz <= 0 || fiz > 100)) {
            total += fiz;
            dersSayisi++;
        }

        System.out.print("Türkçe Notunuzu Giriniz: ");
        tur = input.nextInt();
        if(!(tur <= 0 || tur > 100)) {
            total += tur;
            dersSayisi++;
        }

        System.out.print("Kimya Notunuzu Giriniz: ");
        kim = input.nextInt();
        if(!(kim <= 0 || kim > 100)) {
            total += kim;
            dersSayisi++;
        }

        System.out.print("Müzik Notunuzu Giriniz: ");
        muz = input.nextInt();
        if(!(muz <= 0 || muz > 100)) {
            total += muz;
            dersSayisi++;
        }

        avr = total / dersSayisi;


        if(avr <= 55) {
            System.out.println("Sınıfı Geçemediniz.");
        } else {
            System.out.println("Sınıfı Geçtiniz.");
        }

        System.out.println("Ortalamanız: " + avr);
    }
}