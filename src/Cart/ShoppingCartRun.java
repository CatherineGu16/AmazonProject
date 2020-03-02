
package Cart;

import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Scanner;

//Class header
public class ShoppingCartRun {
    //Start of main method
    public static <Item> void main(String[] args){

        //Declare and instantiate a variable that is an ArrayList that can hold Product objects
        ArrayList<Product> item = new ArrayList<Product>();
        //Declare necessary local variables here
        String Name = null;
        double Price = 0;
        int Quantity = 0;
        String Seller = null;
        Scanner scan = new Scanner(System.in);

        // Write a print statement that welcome's the customer to our shop


        /**
        * create a do while that will be keep looping as long as user wants to continue shopping
         */
         String keepShopping = "Yes";
         Product item1  = new Product(Name, Price, Quantity, Seller);
        //do while loop start
            do
                 {

            //Ask user to enter product name and store it in appropriate local variable
            System.out.print("Please Enter the Product Name: ");
            Name = scan.next();

            //Ask user to enter product price and store it in appropriate local variable
            System.out.print("Please Enter the Price of the Product: ");
            Price = scan.nextDouble();
            //Ask user to enter quantity and store it in appropriate local variable
            System.out.print("Please enter the Quantity: ");
            Quantity = scan.nextInt();
            //Ask user to enter product manufacturer name and store it in appropriate local variable
            System.out.print("Please Enter the Manufacturer: ");
            Seller = scan.next();

            // create a new Product object using above inputed values
            Product newitem = new Product(Name, Price, Quantity, Seller); 

            //add above created Product to the ArrayList cart if Product has available stock
            // if stock not available inform user requested product is out of stock

            //Ask user whether wants to continue shopping 
            //set the do while loop to continue to loop if Yes option is selected
                 } while (keepShopping.equals("Yes"));
    }}