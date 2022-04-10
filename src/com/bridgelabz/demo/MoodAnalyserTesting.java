package com.bridgelabz.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTesting {

	@Test
	public void analysingMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		assertEquals("HAPPY",moodAnalyser.returnEmotion());
	}

}
