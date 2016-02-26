package hqt.designpatterns.patterns.singleton;

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
	 *  
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
