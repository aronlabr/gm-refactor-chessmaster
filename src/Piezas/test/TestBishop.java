package Piezas.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.ArrayList;

import GUI.ChessGameBoard;
import GUI.ChessGamePiece;
import Piezas.Bishop;

/**
 * @author Jonathan lara
 * @version 1.0
 * @since 2016-09-23
 * 
 * This class is used to test the Bishop class.
 */
public class TestBishop {
    // Este código prueba la clase Bishop creando un objeto Bishop en la posición (6,7) en el tablero y
    // luego llamar al método de calcularPosiblesMovimientos() en él. Luego verifica si los movimientos esperados
    // están en el ArrayList devuelto por el método

    @Test
    public void testcalculatePossibleMoves() {
        ChessGameBoard board = new ChessGameBoard();
        Bishop bishop = new Bishop(board, 6, 7, ChessGamePiece.WHITE);
        ArrayList<String> moves = bishop.calculatePossibleMoves(board);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("5,6");
        expected.add("4,5");
        expected.add("3,4");
        expected.add("2,3");
        expected.add("1,2");
        // equals
        assertEquals(expected, moves);
    }
}
