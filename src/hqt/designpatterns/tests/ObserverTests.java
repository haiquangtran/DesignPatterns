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
	// 
	private double expectedTemp = 80;
	private double expectedHumidity = 65;
	private double expectedPressure = 30.4;
	
	@Before
	public void setUp() {
		weatherData = new WeatherData();
		currentDisplay = new CurrentConditionsDisplay(weatherData);
		statsDisplay = new StatisticsDisplay(weatherData);
		forecastDisplay = new ForecastDisplay(weatherData);
	}

	@Test
	public void weatherDataTemperatureShouldBeUpdated() {
		assertEquals(weatherData.getTemperature(), 0, precision);
		weatherData.setMeasurements(expectedTemp, 65, 30.4);
		assertEquals(weatherData.getTemperature(), expectedTemp, precision);
	}
	
	@Test
	public void weatherDataHumidityShouldBeUpdated() {
		assertEquals(weatherData.getHumidity(), 0, precision);
		weatherData.setMeasurements(80, expectedHumidity, 30.4);
		assertEquals(weatherData.getHumidity(), expectedHumidity, precision);
	}
	
	@Test
	public void weatherDataPressureShouldBeUpdated() {
		assertEquals(weatherData.getPressure(), 0, precision);
		weatherData.setMeasurements(80, 65, expectedPressure);
		assertEquals(weatherData.getPressure(), expectedPressure, precision);
	}
	
	@Test
	public void weatherDataShouldUpdateObserverCurrentDisplay() {
		// Not updated yet
		assertEquals(currentDisplay.getTemperature(), 0, precision);
		assertEquals(currentDisplay.getHumdity(), 0, precision);
		assertEquals(currentDisplay.getPressure(), 0, precision);
		
		// Update weather data
		weatherData.setMeasurements(expectedTemp, expectedHumidity, expectedPressure);

		// Updated
		assertEquals(currentDisplay.getTemperature(), expectedTemp, precision);
		assertEquals(currentDisplay.getHumdity(), expectedHumidity, precision);
		assertEquals(currentDisplay.getPressure(), expectedPressure, precision);
	}
	
	@Test
	public void weatherDataShouldUpdateObserverStatisticsDisplay() {
		// Not updated yet
		assertEquals(statsDisplay.getAverage(), 0, precision);
		assertEquals(statsDisplay.getMax(), 0, precision);
		assertEquals(statsDisplay.getMin(), Double.POSITIVE_INFINITY, precision);
		
		// Update weather data
		weatherData.setMeasurements(expectedTemp, expectedHumidity, expectedPressure);

		// Updated
		assertEquals(statsDisplay.getAverage(), expectedTemp, precision);
		assertEquals(statsDisplay.getMax(), Math.max(expectedTemp, Math.max(expectedPressure, expectedHumidity)), precision);
		assertEquals(statsDisplay.getMin(), expectedTemp, precision);
	}

	@Test
	public void weatherDataShouldUpdateObserverForecastDisplay() {
		// Not updated yet
		assertEquals(forecastDisplay.getPressure(), 0, precision);
		
		// Update weather data
		weatherData.setMeasurements(expectedTemp, expectedHumidity, expectedPressure);

		// Updated
		assertEquals(forecastDisplay.getPressure(), expectedPressure, precision);
	}

	
}
