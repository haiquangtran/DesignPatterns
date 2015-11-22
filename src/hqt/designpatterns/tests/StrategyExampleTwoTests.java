package hqt.designpatterns.tests;

import static org.junit.Assert.*;
import hqt.designpatterns.patterns.strategy.exampletwo.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StrategyExampleTwoTests {
	private HashMap<String, String> helperMap = new HashMap<String, String>();
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@Before
	public void setUp() {
		helperMap.put("duck", "Quack!");
		helperMap.put("non-duck", "<< Silence >>");
		helperMap.put("rubber-duck", "Squeak!");
		helperMap.put("flying", "I'm flying!");
		helperMap.put("non-flying", "I can't fly!");
		helperMap.put("rocket", "I'm flying with a rocket!");
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
		System.setErr(null);
	}

	@Test
	public void duckShouldQuack() {
		AbstractDuck mallard = new MallardDuck();
		mallard.performQuack();
		assertEquals(helperMap.get("duck"), outContent.toString().trim());
	}

	@Test
	public void duckShouldFly() {
		AbstractDuck mallard = new MallardDuck();
		mallard.performFly();
		assertEquals(helperMap.get("flying"), outContent.toString().trim());
	}

	@Test
	public void rubberDuckShouldSqueak() {
		AbstractDuck rubberDuck = new RubberDuck();
		rubberDuck.performQuack();
		assertEquals(helperMap.get("rubber-duck"), outContent.toString().trim());
	}
	
	@Test
	public void duckShouldChangeFromFlyingToNonFlyingDuck() {
		AbstractDuck model = new ModelDuck();

		model.performFly();
		assertEquals(helperMap.get("non-flying"), outContent.toString().trim());

		clearConsole();
		model.setFlyBehaviour(new FlyRocketPoweredBehaviour());
		model.performFly();
		assertEquals(helperMap.get("rocket"), outContent.toString().trim());
	}

	public void clearConsole() {
		outContent.reset();
		errContent.reset();
	}

}
