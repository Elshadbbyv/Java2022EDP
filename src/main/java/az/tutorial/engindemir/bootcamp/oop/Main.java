package az.tutorial.engindemir.bootcamp.oop;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delongi Kahve Makinasi") ;
        product1.setUnitPrice( 7500);
        product1.setDiscount(7);
        product1.setImageUrl("image.svg");
        product1.setUnitsInStock(3);

        Product product2 = new Product();
        product2.setName("Sweg Kahve Makinasi") ;
        product2.setUnitPrice( 7500);
        product2.setDiscount(7);
        product2.setImageUrl("image.svg");
        product2.setUnitsInStock(3);

        Product product3 = new Product();
        product3.setName("Delongi Kahve Makinasi") ;
        product3.setUnitPrice( 7500);
        product3.setDiscount(7);
        product3.setImageUrl("image.svg");
        product3.setUnitsInStock(3);

        Product[] product = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product products: product) {
            System.out.println("<li>"+products.getName()+"</li>");

        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("00001");
        individualCustomer.setPhone("055536273");
        individualCustomer.setFirstName("Elshad");
        individualCustomer.setLastName("Babayev");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("00002");
        corporateCustomer.setPhone("0556328282");
        corporateCustomer.setCompanyName("Java");
        corporateCustomer.setTaxNumber("74937");

        Customer[] customers = {individualCustomer,corporateCustomer};
    }
}
