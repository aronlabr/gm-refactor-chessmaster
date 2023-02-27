/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.factory;

import controller.ChessGamePiece;
import controller.factory.nullPieceObject.PieceNull;
import model.pieces.*;
import view.ChessGameBoard;

/**
 *
 * @author mildr
 */
public class PieceFactory {
    public static ChessGamePiece createChessPiece(String PieceType, ChessGameBoard board,
                                                  int row,
                                                  int col,
                                                  int color){
        ChessGamePiece piece;
        piece = null;
        if("Bishop".equalsIgnoreCase(PieceType)){
            piece = new Bishop(board, row, col, color);
        }
        else if("King".equalsIgnoreCase(PieceType)){
            piece = new King(board, row, col, color);
        }
        else if("Knight".equalsIgnoreCase(PieceType)){
            piece = new Knight(board, row, col, color);
        }
        else if("Pawn".equalsIgnoreCase(PieceType)){
            piece = new Pawn(board, row, col, color);
        }
        else if("Queen".equalsIgnoreCase(PieceType)){
            piece = new Queen(board, row, col, color);
        }
        else if("Rook".equalsIgnoreCase(PieceType)){
            piece = new Rook(board, row, col, color);
        }
        else{
            piece = new PieceNull();
        }
        return piece;
    }
}
