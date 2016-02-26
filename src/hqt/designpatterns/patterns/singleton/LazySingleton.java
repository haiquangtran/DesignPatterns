package hqt.designpatterns.patterns.singleton;

/**
 * Warnings:
 * Be careful if using multiple class loaders; this could defeat the Singleton implementation 
 * and result in multiple instances.
 * 
 * If using JVM earlier than 1.2, you need to create registry of Singletons to defeat the garbage collector.
 * 
 * @author Hai
 *
 */
public class LazySingleton {
	private static LazySingleton uniqueInstance;
	
	private LazySingleton() { }
	
	/**
	 * MULTITHREADING OPTIONS:
	 * 
	 * 	1)
	 * 	Add synchronized: no two threads may enter the method at the same time. 
	 *  However, synchronized is expensive and can decrease performance by a factor of 100,
	 *  so if high traffic is part of code that uses getInstances, you might have to reconsider.
	 *  
	 *  2)
	 *  Move to an eagerly created instance rather than a lazily created one.
	 *  
	 *  3)
	 *  Double-checked locking to reduce the use of synchronization in the getInstance().
	 *  We only synchronize the first time through, just what we want.
	 * 
	 * @return
	 */
	public static synchronized LazySingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new LazySingleton();
		}
		return uniqueInstance;
	}
	
	
	/**
	 * For testing purposes only.
	 */
	public static LazySingleton getUniqueInstance() {
		return uniqueInstance;
	}

}
