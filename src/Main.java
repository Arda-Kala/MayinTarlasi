import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row, column;
        System.out.println("----------------Mayın Tarlasına Hoşgeldin----------------");
        System.out.println("Lütfen Oynamak İstediğiniz Boyutları giriniz! ");
        System.out.print("Satır sayısı: ");
        row = scanner.nextInt();
        System.out.print("Sütun sayısı: ");
        column = scanner.nextInt();

        MayinTarlasi mayin = new MayinTarlasi(row,column);

        mayin.run();


        }

    }


