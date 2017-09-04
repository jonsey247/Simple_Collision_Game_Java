package com.TestGame.main;

import java.awt.*;

public class Game extends Canvas implements Runnable {

    private static final long serialVersionUID = -3951107224569388692L;

    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
    private Thread thread;

    public Game() {
        new Window(WIDTH, HEIGHT, "Let's Build A Game!!", this);
    }

    public synchronized void start() {

    }

    public void run() {

    }


    public static void main(String args[]) {

        new Game();

    }
}
