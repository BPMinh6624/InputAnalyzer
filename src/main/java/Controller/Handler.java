/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import View.Menu;

/**
 *
 * @author tuanh
 */
public class Handler extends Menu <String> {

    static String[] mc = {"Input string", "Exit"};
    private Algorithm al;

    public Handler() {
        super("===== INPUT ANALYZE PROGRAM =====", mc);
        al = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                al.inputAnalyzer();
                break;
            case 2: 
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid! Please input another choice");
        }
    }
}
