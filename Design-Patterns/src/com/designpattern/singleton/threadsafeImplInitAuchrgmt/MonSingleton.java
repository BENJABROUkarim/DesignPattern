/**
 * @author kbenjabr 18 oct. 2017/16:00:33 Software Engineer At Capgemini Morocco
 *
 */
package com.designpattern.singleton.threadsafeImplInitAuchrgmt;

/**
 * la classe est déclarée final pour empêcher la création d'une classe fille
 */
public final class MonSingleton {

	/**
	 * implémentation threadsafe avec initialisation au chargement de la classe
	 */
	private static MonSingleton instance = new MonSingleton();

	/**
	 * ne pas oublier de redéfinir le constructeur par défaut si aucun
	 * constructeur n'est explicitement défini
	 */
	private MonSingleton() {
		// traitement du constructeur
	}

	/**
	 * un getter static permet de renvoyer l'instance et de la créer au besoin
	 * ne synchroniser que la création de l'instance
	 */

	public static  MonSingleton getInstance() {
		return instance;
	}

}
