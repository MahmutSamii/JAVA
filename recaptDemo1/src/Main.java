public class Main {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 22;

        int enBuyuk = sayi1;

        if (enBuyuk<sayi2){
            enBuyuk = sayi2;
            System.out.println("En büyük sayı sayi2 adlı değişkendir:"+enBuyuk);
        } else if (enBuyuk<sayi3) {
            enBuyuk = sayi3;
            System.out.println("En büyük sayı sayi3 adlı değişkendir:"+enBuyuk);
        }else{
            System.out.println("En büyük sayı sayi1 adlı değişkendir:"+enBuyuk);
        }


    }
}