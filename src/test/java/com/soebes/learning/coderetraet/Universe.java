package com.soebes.learning.coderetraet;

import java.util.Map;

public class Universe {

	private Map<Point, CellState> cellStates;
	
	public void setCellState(Point point, CellState alive) {
		
	}

	public CellState getCellState(Point point) {
		return CellState.Alive;
	}

}
