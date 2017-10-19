/**
 * @author kbenjabr 18 oct. 2017/16:00:33 Software Engineer At Capgemini Morocco
 *
 */
package com.designpattern.singleton.threadsafeImplInitAuchrgmt;

/**
 * la classe est d�clar�e final pour emp�cher la cr�ation d'une classe fille
 */
public final class MonSingleton {

	/**
	 * impl�mentation threadsafe avec initialisation au chargement de la classe
	 */
	private static MonSingleton instance = new MonSingleton();

	/**
	 * ne pas oublier de red�finir le constructeur par d�faut si aucun
	 * constructeur n'est explicitement d�fini
	 */
	private MonSingleton() {
		// traitement du constructeur
	}

	/**
	 * un getter static permet de renvoyer l'instance et de la cr�er au besoin
	 * ne synchroniser que la cr�ation de l'instance
	 */

	public static  MonSingleton getInstance() {
		return instance;
	}

}
