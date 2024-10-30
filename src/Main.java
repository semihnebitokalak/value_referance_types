// Bu dersimizde değer ve referans tiplerini görücez. Bunlar nedir? Aralarındaki fark nedir?
public class Main {
    public static void main(String[] args){

        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);
        // Buradaki output nedir? == 10
        // Bildiğiniz üzere bu değerlerin sabit tutulduğu bir adres yoktur.
        // Bellekte stack tarafında depolanırlar. Bir de elimizde heap denilen bellekte tutulan bir alan vardır.
        // Şimdi 2 tane int dizi oluşturalım.
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
        // bunun çıktısı nedir?
        // Diziler referans tiptir. int byte olmasının bir farkı yoktur.
        // Class mantığı ile aynıdır.
        // Elimizde 1 stack ve 1 heap vardır.
        // Adres mantığı ile çalışır.
        // sayilar1 stack tarafında tutulur ve değerleri heapte tutulur ve adres yöntemiyle ulaşılabilir.
    }
}