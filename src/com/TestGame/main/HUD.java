package com.TestGame.main;

import java.awt.*;

public class HUD {

    public static int HEALTH = 100;

    private int greedValue = 255;

    private int score = 0;
    private int level = 1;

    public void tick() {

        HEALTH = Game.clamp(HEALTH,0, 100);

        greedValue = Game.clamp(greedValue, 0, 255);

        greedValue = HEALTH * 2;

        score++;

    }

    public void render(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(15, 15, 200, 32);
        g.setColor(new Color(75, greedValue, 0));
        g.fillRect(15, 15, HEALTH * 2, 32);
        g.setColor(Color.white);
        g.drawRect(15, 15, 200, 32);

        g.drawString("Score: " + score, 9, 64);
        g.drawString("Level: " + level, 10, 80);
    }
}
