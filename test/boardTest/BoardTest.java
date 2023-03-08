/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package boardTest;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import view.ChessGameBoard;
import model.board.BoardSquare;

/**
 *
 * @author mildr
 */
public class BoardTest {
    
    private static ChessGameBoard board;
    
    @Before
    public void setUp() {
        board = new ChessGameBoard();
    }
    
    @Test
    public void testBoardCell(){
        BoardSquare cell = board.getCell(4, 5);
        assertNotNull(cell);
        assertEquals(4, cell.getRow());
        assertEquals(5, cell.getColumn());
    }
}
