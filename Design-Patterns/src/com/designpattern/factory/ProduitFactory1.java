/**
 * @author kbenjabr 18 oct. 2017/14:59:19 Software Engineer At Capgemini Morocco
 *
 */
package com.designpattern.factory;

public class ProduitFactory1 extends ProduitFactory {

	protected ProduitA createProduitA() {
		return new ProduitA1();
	}
}
