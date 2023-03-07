package components;


import GUI.ChessGameBoard;
import GUI.ChessGameEngine;
import GUI.ChessGameLog;
import GUI.ChessGraveyard;
import GUI.ChessMenuBar;

public interface ChessComponentFactory {
    ChessMenuBar createMenuBar();

    ChessGameBoard createGameBoard();

    ChessGameLog createGameLog();

    ChessGraveyard createGraveyard(String name);

    ChessGameEngine createGameEngine(ChessGameBoard gameBoard);
}
