/**
 * @author kbenjabr 18 oct. 2017/14:58:02 Software Engineer At Capgemini Morocco
 *
 */
package com.designpattern.factory;

public abstract class ProduitFactory {
	
	public ProduitA getProduitA(){
		return createProduitA();
	}
	
	protected abstract ProduitA createProduitA();
}

