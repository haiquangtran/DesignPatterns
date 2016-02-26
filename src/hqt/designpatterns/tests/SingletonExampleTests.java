package hqt.designpatterns.tests;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import hqt.designpatterns.patterns.factory.otherfactory.NYCheesePizza;
import hqt.designpatterns.patterns.singleton.LazySingleton;

import org.junit.Test;

public class SingletonExampleTests {

	@Test
	public void uniqueInstanceShouldBeALazySingleton() {
		// Lazy Instantiation for singleton class
		assertEquals(LazySingleton.getUniqueInstance(), null);
		assertThat(LazySingleton.getInstance(), instanceOf(LazySingleton.class));
	}

	@Test
	public void uniqueInstanceShouldBeAEagerSingleton() {
		assertThat(EagerSingleton.getUniqueInstance(), instanceOf(EagerSingleton.class));
		assertThat(EagerSingleton.getInstance(), instanceOf(EagerSingleton.class));
	}

	@Test
	public void uniqueInstanceShouldBeALockingSingleton() {
		// Lazy Instantiation for singleton locking class
		assertEquals(LockingSingleto.getUniqueInstance(), null);
		assertThat(LockingSingleto.getInstance(), instanceOf(LockingSingleto.class));
	}

}


