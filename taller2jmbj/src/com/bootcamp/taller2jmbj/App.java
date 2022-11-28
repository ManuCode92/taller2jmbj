package com.bootcamp.taller2jmbj;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

import com.bootcamp.taller2jmbj.respository.Product;
import com.bootcamp.taller2jmbj.respository.Tax;

/**
 * 
 * @author jmbj
 *
 */
public class App {

	public static void main(String[] args) {

		List<Product> shoppingCart = List.of(new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		BigDecimal priceTotal = BigDecimal.ZERO;
		BigDecimal sumaImpuesto = BigDecimal.ZERO;
		BigDecimal priceIVA = null;


		for (int i = 0; i < shoppingCart.size(); i++) {
			
			sumaImpuesto = shoppingCart.get(i).getPrice().multiply(BigDecimal.valueOf(shoppingCart.get(i).getTax().getPercent())).divide(BigDecimal.valueOf(100)) ;
			priceIVA = shoppingCart.get(i).getPrice().add(sumaImpuesto); 		
			priceTotal = priceTotal.add(priceIVA);

		}
		
		System.out.println("Precio total del carrito: " +priceTotal + " €");
		
		System.out.println("Lista por C");
		shoppingCart.stream().filter(Product -> Product.name.startsWith("C")).sorted(Comparator.comparing(Product::getName)).forEach(System.out::println);

	}
	

}
