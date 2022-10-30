package az.tutorial.engindemir.bootcamp.twentyfive;

public class Main {
    //
    public static void main(String[] args) {
        String message = "Today weather so sunny";
        String newMessage = getCity("Baku");
        int num = plus(23,45);
        System.out.println(newMessage);
        System.out.println(num);
        int top = plusTwo(2,3,4,5,5);
        System.out.println(top);
    }
    // Void onemi
    // ekrana print yapmasi deger dondurmek demek degildir
    public static void save(){}
    public static void delete(){}

    public static void update(){}

    //eger void kullanmazsiniz return yazmalisinizdir,
    public static int plus(int num1, int num2){return num1+num2;}
    public static String getCity(String city){return city;}
    // Variable Arguments
    public static int plusTwo(int... numbers){
        int top = 0;
        for (int number: numbers) {top+=number;
        }
        return top;}

}
