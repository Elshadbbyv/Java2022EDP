package az.tutorial.engindemir.bootcamp.oop;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Delongi Kahve Makinasi";
        product1.unitPrice = 7500;
        product1.discount= 7;
        product1.imageUrl= "image.svg";
        product1.unitsInStock= 3;

        Product product2 = new Product();
        product2.name = "Delongi Kahve Makinasi";
        product2.unitPrice = 7500;
        product2.discount= 7;
        product2.imageUrl= "image.svg";
        product2.unitsInStock= 3;

        Product product3 = new Product();
        product3.name = "Delongi Kahve Makinasi";
        product3.unitPrice = 7500;
        product3.discount= 7;
        product3.imageUrl= "image.svg";
        product3.unitsInStock= 3;

        Product[] product = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product products: product) {
            System.out.println(""+products);

        }


    }
}
