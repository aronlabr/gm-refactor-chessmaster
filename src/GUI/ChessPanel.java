package GUI;
import java.awt.*;
import javax.swing.*;

import org.junit.*;

import Factory.DefaultChessComponentFactory;
import components.ChessComponentFactory;

import static org.junit.Assert.assertTrue;
// -------------------------------------------------------------------------
/**
 * The main panel of the Chess game.
 * 
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class ChessPanel
    extends JPanel{
    private ChessMenuBar    menuBar;
    private ChessGameBoard  gameBoard;
    private ChessGameLog    gameLog;
    private ChessGraveyard  playerOneGraveyard;
    private ChessGraveyard  playerTwoGraveyard;
    private transient  ChessGameEngine gameEngine;
    // ----------------------------------------------------------
    /**
     * Create a new ChessPanel object.
     */
    public ChessPanel(){
        this.setLayout( new BorderLayout() );
        ChessComponentFactory componentFactory = new DefaultChessComponentFactory();
        menuBar = componentFactory.createMenuBar();
        gameBoard = componentFactory.createGameBoard();
        gameLog = componentFactory.createGameLog();
        playerOneGraveyard = componentFactory.createGraveyard("Player 1's graveyard");
        playerTwoGraveyard = componentFactory.createGraveyard("Player 2's graveyard");
        this.add( menuBar, BorderLayout.NORTH );
        this.add( gameBoard, BorderLayout.CENTER );
        this.add( gameLog, BorderLayout.SOUTH );
        this.add( playerOneGraveyard, BorderLayout.WEST );
        this.add( playerTwoGraveyard, BorderLayout.EAST );
        this.setPreferredSize( new Dimension( 800, 600 ) );
        gameEngine = componentFactory.createGameEngine(gameBoard); // start the game
    }
    // ----------------------------------------------------------
    /**
     * Gets the logger object for use in other classes.
     * 
     * @return ChessGameLog the ChessGameLog object
     */
    public ChessGameLog getGameLog(){
        return gameLog;
    }
    // ----------------------------------------------------------
    /**
     * Gets the board object for use in other classes.
     * 
     * @return ChessGameBoard the ChessGameBoard object
     */
    public ChessGameBoard getGameBoard(){
        return gameBoard;
    }
    // ----------------------------------------------------------
    /**
     * Gets the game engine object for use in other classes
     * 
     * @return ChessGameEngine the ChessGameEngine object
     */
    public ChessGameEngine getGameEngine(){
        return gameEngine;
    }
    // ----------------------------------------------------------
    /**
     * Gets the appropriate graveyard object for use in other classes.
     * 
     * @param whichPlayer
     *            the number of the player (1 or 2)
     * @return ChessGraveyard the graveyard requested
     */
    public ChessGraveyard getGraveyard(int whichPlayer) {
        return (whichPlayer == 1) ? playerOneGraveyard : (whichPlayer == 2) ? playerTwoGraveyard : null;
    }


    // Esta prueba comprueba que el método ChessPanel.getGameLog() devuelve una instancia de ChessGameLog
    // El ChessPanel se crea usando el constructor

    @Test
    public void testGetGameLog() {
        ChessPanel panel = new ChessPanel(); // aqui crea los componentes con el patron factory
        ChessGameLog log = panel.getGameLog();
        assertTrue(log instanceof ChessGameLog);
    }
    // El siguiente código crea un nuevo objeto ChessPanel y llama a su función getGameBoard.
    // La función getGameBoard devuelve un objeto ChessGameBoard, que se asigna al tablero
    // variable. A continuación, se comprueba la variable del tablero para ver si es una instancia de ChessGameBoard.
    // Si es así, la prueba pasa.
    @Test
    public void testGetGameBoard() {
        ChessPanel panel = new ChessPanel();
        ChessGameBoard board = panel.getGameBoard();
        assertTrue(board instanceof ChessGameBoard);
    }
    // Esta prueba comprueba que el método getGameEngine de la clase ChessPanel devuelve un objeto ChessGameEngine.
    // El método getGameEngine se usa para devolver el objeto del motor del juego que se usa en el juego.

    @Test
    public void testGetGameEngine() {
        ChessPanel panel = new ChessPanel();
        ChessGameEngine engine = panel.getGameEngine();
        assertTrue(engine instanceof ChessGameEngine);
    }
}
