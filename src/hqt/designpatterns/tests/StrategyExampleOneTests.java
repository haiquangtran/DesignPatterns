package hqt.designpatterns.tests;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import hqt.designpatterns.patterns.strategy.*;
import hqt.designpatterns.patterns.strategy.exampleone.AbstractCharacter;
import hqt.designpatterns.patterns.strategy.exampleone.BowAndArrowBehaviour;
import hqt.designpatterns.patterns.strategy.exampleone.King;
import hqt.designpatterns.patterns.strategy.exampleone.NoWeaponBehaviour;
import hqt.designpatterns.patterns.strategy.exampleone.Queen;
import hqt.designpatterns.patterns.strategy.exampleone.SwordBehaviour;
import hqt.designpatterns.patterns.strategy.exampleone.Troll;

import org.hamcrest.core.IsInstanceOf;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StrategyExampleOneTests {
	private ArrayList<AbstractCharacter> characters = new ArrayList<AbstractCharacter>();
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	
	@Before
	public void setUp() {
		characters.add(new King());
		characters.add(new Queen());
		characters.add(new Troll());
	}
	
	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}

	@Test
	public void charactersShouldHaveNoWeaponBehaviour() {
		for (int i = 0; i < characters.size(); i++) {
			assertTrue("Characters should be using no weapons!", characters.get(i).getWeapon() instanceof NoWeaponBehaviour);
		}
	}

	@Test
	public void charactersShouldSwapToSwordFromNoWeapons() {
		for (int i = 0; i < characters.size(); i++) {
			assertTrue("Characters should be using no weapons!", characters.get(i).getWeapon() instanceof NoWeaponBehaviour);
			characters.get(i).setWeapon(new SwordBehaviour());
			assertTrue("Characters should be using Swords!", characters.get(i).getWeapon() instanceof SwordBehaviour);
		}
	}

	@Test 
	public void trollShouldSwapToBowAndArrowFromNoWeapons() {
		for (int i = 0; i < characters.size(); i++) {
			assertTrue("Characters should be using no weapons!", characters.get(i).getWeapon() instanceof NoWeaponBehaviour);
		}
		int trollIndex = characters.size()-1;
		characters.get(trollIndex).setWeapon(new BowAndArrowBehaviour());
		assertTrue("Character troll should be using a Bow and Arrow!", characters.get(trollIndex).getWeapon() instanceof BowAndArrowBehaviour);
	}

	@Test
	public void kingShouldPrintFightMeWithNoWeapons() {
		King king = (King) characters.get(0);
		king.fight();
		assertEquals("I am using no weapons! only my fists!", outContent.toString().trim());
	}
	
	@Test
	public void kingShouldPrintSwappingToSwordFromNoWeapons() {
		King king = (King) characters.get(0);
		String noWeaponsOutput = "I am using no weapons! only my fists!";
		String swordOutput = "I am using a sword!";
		// Fight with no weapons
		king.fight();
		assertEquals(noWeaponsOutput, outContent.toString().trim());
		// Clear console
		outContent.reset();
		// Swap to fight with a sword
		king.setWeapon(new SwordBehaviour());
		king.fight();
		assertEquals(swordOutput, outContent.toString().trim());
	}

}
