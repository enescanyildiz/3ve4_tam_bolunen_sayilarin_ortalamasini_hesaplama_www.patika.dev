import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int sayi,toplam=0,adet=0;
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        sayi=input.nextInt();
        while (sayi<=0)
        {
            System.out.print("Lütfen 0'dan Büyük Bir Sayı Giriniz: ");
            sayi=input.nextInt();
        }
        for (int i=1; i<=sayi; i++)
        {
           if((i%3==0)&&(i%4==0))
           {
               toplam=toplam+i;//toplam+=i;
               adet++;
           }

        }
        int ort;
        ort=toplam/adet;
        System.out.println("Sonuç: "+ort);
    }
}