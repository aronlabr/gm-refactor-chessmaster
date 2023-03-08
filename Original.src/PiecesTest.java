package clases;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

public class PiecesTest {

    @Test
    public void PawnTest() {
        ChessGameBoard tablero1 = new ChessGameBoard();
        Pawn pawn1 = new Pawn(tablero1, 3, 6, ChessGamePiece.WHITE);
        ArrayList<String> movPosibles = pawn1.calculatePossibleMoves(tablero1);
        ArrayList<String> aComparar = new ArrayList<>(Arrays.asList("1,6"));
        assertEquals(movPosibles, aComparar);
    }
    
    @Test
    public void KnightTest() {
        ChessGameBoard tablero1 = new ChessGameBoard();
        Knight knight1 = new Knight(tablero1, 1, 0, ChessGamePiece.WHITE);
        ArrayList<String> movPosibles = knight1.calculatePossibleMoves(tablero1);
        ArrayList<String> aComparar = new ArrayList<>(Arrays.asList("3,1", "2,2", "0,2"));
        assertEquals(movPosibles, aComparar);
    }
    
    @Test
    public void KingTest() {
        ChessGameBoard tablero1 = new ChessGameBoard();
        King king1 = new King(tablero1, 3, 7, ChessGamePiece.WHITE);
        ArrayList<String> movPosibles = king1.calculatePossibleMoves(tablero1);
        ArrayList<String> aComparar = new ArrayList<>(Arrays.asList("2,6", "4,6", "2,7", "4,7", "3,6"));
        assertEquals(movPosibles, aComparar);
    }
}