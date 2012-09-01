package com.soebes.learning.coderetraet;

import static org.fest.assertions.Assertions.assertThat;

import org.testng.annotations.Test;

public class ConvaysGameOfLifeTest {

	@Test
	public void firstTest() {
		Universe universe = new Universe();
		universe.setCellState(new Point(0,0), CellState.Alive);
		assertThat(universe.getCellState(new Point(0, 0))).isEqualTo(CellState.Alive);
	}

}
