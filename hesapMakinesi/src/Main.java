import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz:");
        n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");

        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        select= input.nextInt();

        switch(select){
            case 1:
            System.out.println("Toplama İşlemi Sonucu : " + (n1+n2));
            break;

            case 2:
                System.out.println("Çıkarma İşlemi Sonucu : " + (n1-n2));
            break;

            case 3:
                System.out.println("Çarpma İşlemi Sonucu : " + (n1*n2));
            break;

            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme İşlemi Sonucu : " + (n1/n2));
                }
                else{
                    System.out.println("Bir sayı 0'a bölünemez.");
                }

                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız.");
        }


    }

}
