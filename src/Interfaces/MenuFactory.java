package Interfaces;

import javax.swing.JMenu;

public interface MenuFactory {
    JMenu createMenu(String category, String items);
}
