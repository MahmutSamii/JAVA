public class Main {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            System.out.println(i);
        }
        System.out.println("Döngü Bitti");
        for (int i=1;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("Tekli Sayılar Bitti");
        for (int i=2;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("Çiftli Sayılar Bitti");
        //While
        int i =1;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti");
    }
}