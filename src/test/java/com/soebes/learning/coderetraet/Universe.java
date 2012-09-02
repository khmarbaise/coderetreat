package com.soebes.learning.coderetraet;

import java.util.HashMap;
import java.util.Map;

public class Universe {

    private Map<Point, CellState> cellStates;

    public Universe(int sizeOfTheUniverse) {
        cellStates = new HashMap<Point, CellState>();
        initializeUniverse(sizeOfTheUniverse);
    }

    private void initializeUniverse(int sizeOfTheUniverse) {
        for(int row = 0; row < sizeOfTheUniverse; row++) {
            for(int column = 0; column < sizeOfTheUniverse; column++) {
                cellStates.put(new Point(column, row), CellState.Dead);
            }
        }
    }

    public void setCellState(Point point, CellState cellState) {
        cellStates.put(point, cellState);
    }

    public CellState getCellState(Point point) {
        return cellStates.get(point);
    }

}
