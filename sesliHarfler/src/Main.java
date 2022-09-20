public class Main {
    public static void main(String[] args) {
        char harf = 'i';
        switch (harf){
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce Sesli Harf");
        }
    }
}