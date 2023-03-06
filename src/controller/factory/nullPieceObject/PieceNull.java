/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.factory.nullPieceObject;

import controller.ChessGamePiece;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import view.ChessGameBoard;

/**
 * A null or empty piece in a game of chess.
 * This class provides no additional functionality beyond its superclass,
 * but is intended to be used as a placeholder for empty spaces on a chess board.
 */
public class PieceNull extends ChessGamePiece {
    public PieceNull(){
        super();
    }
    
    public boolean isNull(){
        return true;
    }
    
    /**
     *
     * @param board
     * @return
     */
    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> moves = new ArrayList<>();
        return moves;
    }

    /**
     *
     * @return
     */
    @Override
    public ImageIcon createImageByPieceType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
