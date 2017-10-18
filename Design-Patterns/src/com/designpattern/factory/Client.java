/**
 * @author kbenjabr 18 oct. 2017/14:56:50 Software Engineer At Capgemini Morocco
 *
 */
package com.designpattern.factory;

public class Client {
	public static void main(String[] args) {
		ProduitFactory produitFactory1 = new ProduitFactory1();
		ProduitFactory produitFactory2 = new ProduitFactory2();

		ProduitA produitA = null;
		
		System.out.println("Utilisation de la premiere fabrique");
		produitA = produitFactory1.getProduitA();
		produitA.methodeA();

		System.out.println("Utilisation de la seconde fabrique");
		produitA = produitFactory2.getProduitA();
		produitA.methodeA();

	}

}
