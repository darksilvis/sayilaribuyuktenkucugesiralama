import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;

        Scanner input = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz: ");
        sayi1 = input.nextInt();

        System.out.println("2. sayıyı giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("3. sayıyı giriniz: ");
        sayi3 = input.nextInt();

        // En büyük sayıyı bulma
        if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println("En büyük sayı: " + sayi1);
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println("En büyük sayı: " + sayi2);
        } else {
            System.out.println("En büyük sayı: " + sayi3);
        }

        // Sayıları büyükten küçüğe sıralama
        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            if (sayi2 >= sayi3) {
                System.out.println("Sıralama: " + sayi1 + " > " + sayi2 + " > " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi1 + " > " + sayi3 + " > " + sayi2);
            }
        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            if (sayi1 >= sayi3) {
                System.out.println("Sıralama: " + sayi2 + " > " + sayi1 + " > " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi2 + " > " + sayi3 + " > " + sayi1);
            }
        } else {
            if (sayi1 >= sayi2) {
                System.out.println("Sıralama: " + sayi3 + " > " + sayi1 + " > " + sayi2);
            } else {
                System.out.println("Sıralama: " + sayi3 + " > " + sayi2 + " > " + sayi1);
            }
        }
    }
}
