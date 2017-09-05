package com.TestGame.main;

import java.awt.*;

public class FastEnemy extends GameObject {

    private Handler handler;

    public FastEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 2;
        velY = 9;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 16, 16);
    }

    public void tick() {
        x += velX;
        y += velY;
        if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
        if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;

        handler.addObject(new Trail(x, y, ID.Trail ,Color.cyan, 16, 16, 0.04f, handler));

    }

    public void render(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(x, y, 16, 16);
    }


}