package Factory;

import GUI.ChessGameBoard;
import GUI.ChessGameEngine;
import GUI.ChessGameLog;
import GUI.ChessGraveyard;
import GUI.ChessMenuBar;
import components.ChessComponentFactory;

public class DefaultChessComponentFactory implements ChessComponentFactory {
    public ChessMenuBar createMenuBar() {
        return new ChessMenuBar();
    }

    public ChessGameBoard createGameBoard() {
        return new ChessGameBoard();
    }

    public ChessGameLog createGameLog() {
        return new ChessGameLog(); 
    }

    public ChessGraveyard createGraveyard(String name) {
        return new ChessGraveyard(name);
    }

    public ChessGameEngine createGameEngine(ChessGameBoard board) {
        return new ChessGameEngine(board);
    }
}