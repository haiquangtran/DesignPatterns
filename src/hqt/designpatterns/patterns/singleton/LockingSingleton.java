package hqt.designpatterns.patterns.singleton;

public class LockingSingleton {
	// volatile: Ensures multiple threads handle uniqueInstance correctly when initialized to the instance. 
	private volatile static LockingSingleton uniqueInstance;
	
	private LockingSingleton() { }
	
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
	public static LockingSingleton getInstance() {
		if (uniqueInstance == null) {
			// Only synchronize the first time through
			synchronized (LockingSingleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new LockingSingleton();
				}
			}
		}
		return uniqueInstance;
	}
	
	/**
	 * For testing purposes only.
	 */
	public static LockingSingleton getUniqueInstance() {
		return uniqueInstance;
	}

}
