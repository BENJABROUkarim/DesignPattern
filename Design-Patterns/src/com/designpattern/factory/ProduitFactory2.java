/**
 * @author kbenjabr 18 oct. 2017/15:00:00 Software Engineer At Capgemini Morocco
 *
 */
package com.designpattern.factory;

public class ProduitFactory2 extends ProduitFactory {

	protected ProduitA createProduitA() {
		return new ProduitA2();
	}
}

