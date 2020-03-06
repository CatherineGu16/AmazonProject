
package Cart;

import java.util.*;
import Cart.InitialCart;

public class ShoppingCartRun extends InitialCart {
	
	public static void main(String[] args) {
		boolean end = false;
		System.out.println("Welcome to C.A.S.!");
		ShoppingCartRun cart = new ShoppingCartRun();
		InitialCart contents = new InitialCart();
		contents.toString();
		
		Scanner inp = new Scanner(System.in);
		do {
			System.out.print("\n(S) Get which item? > ");
			String a= inp.next();
			System.out.print("\n(D) How much is it? > ");
			double b = inp.nextInt();
			cart.addToCart(a, b);
			
			//call initial cart
			

			System.out.print("\n(Y/N) Get another item? > ");
			String d = inp.next();
			switch (d) {
			case "y":
				// nothing
				break;
			case "n":
				end = true;
				System.out.println(contents);

				break;
			default:
			}
		} while (!end);
	}


}