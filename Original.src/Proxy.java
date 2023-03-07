package clases;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Proxy implements IProxy{
    private static Proxy instancia = null;
    private Proxy() {
    }
    
    @Override
    public void permitirJuego() {
        JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frame.getContentPane().add( new ChessPanel() );
        frame.pack();
        frame.setVisible( true );
    }
    
    public static Proxy obtenerInstancia() {
        if(instancia == null)
            instancia = new Proxy();
        return instancia;
    }
}

class ProxyMain {
    public static void main( String[] args ){
        Proxy juego1;
        juego1 = Proxy.obtenerInstancia();
        juego1.permitirJuego();
    }
}


