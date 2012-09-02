package com.soebes.learning.coderetraet;

import static org.fest.assertions.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * <pre>
 *     0   1   2
 *   +---+---+---+
 * 0 !   !   !   !
 *   +---+---+---+
 * 1 !   !   !   !
 *   +---+---+---+
 * 2 !   !   !   !
 *   +---+---+---+
 * </pre>
 * 
 * @author Karl-Heinz Marbaise
 *
 */
public class ConwaysGameOfLifeTest {
    private Universe universe;
    
    @BeforeMethod
    public void beforeMethod() {
        universe = new Universe(3);
    }

    @Test
	public void setStateAtParticularPositionAndGetItBack() {
		universe.setCellState(new Point(0,0), CellState.Alive);
		CellState result = universe.getCellState(new Point(0, 0)); 
		assertThat(result).isEqualTo(CellState.Alive);
	}

	@Test
	public void setStateAtAnOtherParticularPositionAndGetItBack() {
		universe.setCellState(new Point(1,0), CellState.Alive);
		assertThat(universe.getCellState(new Point(1, 0))).isEqualTo(CellState.Alive);
	}

	@Test
    public void getStateBackAfterInitialization() {
        assertThat(universe.getCellState(new Point(1, 0))).isEqualTo(CellState.Dead);
    }

	@Test
	public void xx() {
	    //Given
	    List<Point> listOfPoints = Arrays.asList(new Point(0,0), new Point(0,1), new Point(0,2));

	    for (Point point : listOfPoints) {
            universe.setCellState(point, CellState.Alive);
        }

	    //When
	    int numberOfLivingCells = 0;
	    for (Point point : listOfPoints) {
            CellState result = universe.getCellState(point);
            if (result.equals(CellState.Alive)) {
                numberOfLivingCells++;
            }
        }

	    //Then
	    assertThat(numberOfLivingCells).isEqualTo(3);
	}
}
