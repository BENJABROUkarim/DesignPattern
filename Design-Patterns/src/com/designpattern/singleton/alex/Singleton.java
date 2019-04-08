package com.designpattern.singleton.alex;

public final class Singleton
{       
    /** Constructeur priv�t */  
    private Singleton()
    {}
     
    /** Holder */
    private static class SingletonHolder
    {       
        /** Instance unique non pr�initialis�e */
        private final static Singleton instance = new Singleton();
    }
 
    /** Point d'acc�s pour l'instance unique du singleton */
    public static Singleton getInstance()
    {
        return SingletonHolder.instance;
    }
}
