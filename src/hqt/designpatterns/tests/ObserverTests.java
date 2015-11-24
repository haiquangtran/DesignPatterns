package hqt.designpatterns.tests;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import hqt.designpatterns.patterns.observer.*;
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

public class ObserverTests {
	private double precision = 0;
	private WeatherData weatherData;
	private CurrentConditionsDisplay currentDisplay;
	private StatisticsDisplay statsDisplay;
	private ForecastDisplay forecastDisplay;
	
	@Before
	public void setUp() {
		weatherData = new WeatherData();
		currentDisplay = new CurrentConditionsDisplay(weatherData);
		statsDisplay = new StatisticsDisplay(weatherData);
		forecastDisplay = new ForecastDisplay(weatherData);
	}

	@Test
	public void weatherDataTemperatureShouldBeUpdated() {
		double expectedTemp = 80;
		assertEquals(weatherData.getTemperature(), 0, precision);
		weatherData.setMeasurements(expectedTemp, 65, 30.4);
		assertEquals(weatherData.getTemperature(), expectedTemp, precision);
	}
	
	@Test
	public void weatherDataHumidityShouldBeUpdated() {
		double expectedHumidity = 65;
		assertEquals(weatherData.getHumidity(), 0, precision);
		weatherData.setMeasurements(80, expectedHumidity, 30.4);
		assertEquals(weatherData.getHumidity(), expectedHumidity, precision);
	}
	
	@Test
	public void weatherDataPressureShouldBeUpdated() {
		double expectedPressure = 30.4;
		assertEquals(weatherData.getPressure(), 0, precision);
		weatherData.setMeasurements(80, 65, expectedPressure);
		assertEquals(weatherData.getPressure(), expectedPressure, precision);
	}
	
}
