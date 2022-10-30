package az.tutorial.engindemir.bootcamp.twentyfour;

public class Main {
    public static void main(String[] args) {
        
        
        
    }
    //Metod ve Referans isimleri camelCase ile yazilmalidir
    public static void defineNumber(){
        int[] numbers = new int[]{1,2,3,4,5,6,7};
        int findNumber = 5;
        boolean checkNumber = false;
        for (int number: numbers){
            if (number == findNumber){
                checkNumber = true;
                break;
            }
            
            
        }
        if (checkNumber){
            System.out.println("Number found: "+findNumber);
        }else {
            System.out.println("Number couldn't find"+findNumber);
        }
    }
}
