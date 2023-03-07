package GUI;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.util.Date;
import javax.swing.ScrollPaneConstants;

import org.junit.*;

import static org.junit.Assert.assertEquals;
// -------------------------------------------------------------------------
/**
 * A scrollable textArea representing the game log. (i.e. moves made by each
 * player)
 * 
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class ChessGameLog
    extends JScrollPane{
    private JTextArea textArea;
    // ----------------------------------------------------------
    /**
     * Create a new ChessGameLog object.
     */
    public ChessGameLog(){
        super(
            new JTextArea( "", 5, 30 ),
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS );
        textArea = ( (JTextArea)this.getViewport().getView() );
    }
    // ----------------------------------------------------------
    /**
     * Adds a new line of text to the log.
     * 
     * @param s
     *            the line of text to add
     */
    public void addToLog( String s ){
        if ( textArea.getText().length() > 0 ){
            textArea.setText( textArea.getText() + "\n" + new Date() + " - "
                + s );
        }
        else
        {
            textArea.setText( new Date() + " - " + s );
        }
    }
    /**
     * Clears the log.
     */
    public void clearLog(){
        textArea.setText( "" );
    }
    // ----------------------------------------------------------
    /**
     * Gets the most recent statement added to the log.
     * 
     * @return String the most recent log statement
     */
    public String getLastLog(){
        int indexOfLastNewLine = textArea.getText().lastIndexOf( "\n" );
        if ( indexOfLastNewLine < 0 ){
            return textArea.getText();
        }
        return textArea.getText().substring( indexOfLastNewLine + 1 );
    }

    // Se usa para probar la clase ChessGameLog
    // La clase ChessGameLog tiene las siguientes funciones:
    // addToLog(String s): agrega la cadena s al registro
    // getLastLog(): Devuelve la última cadena agregada al registro
    // clearLog(): Borra el registro

    @Test
    public void testChessGameLog(){
        ChessGameLog log = new ChessGameLog();
        Date date = new Date();
        log.addToLog( "test" );
        assertEquals(date + " - " + "test", log.getLastLog() );
        log.addToLog( "test2" );
        assertEquals( date + " - " + "test2", log.getLastLog() );
        log.clearLog();
        assertEquals( "", log.getLastLog() );
    }
}
