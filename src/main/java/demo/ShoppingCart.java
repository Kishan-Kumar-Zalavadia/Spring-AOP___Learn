package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
        //Logging
        //Authentication and Authorization
        //Sanitize the data

        //All the above are Cross-Cutting-Concerns (Each one is known as an aspect)

        //The below is the Business Login

        System.out.println("Checkout method from shopping cart called");

        //AOP is used to separate Business-Login with Cross-Cutting-Concerns

    }

    public int quantity(){
        return 9;
    }
}
