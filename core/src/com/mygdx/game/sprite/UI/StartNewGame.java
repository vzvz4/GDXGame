package com.mygdx.game.sprite.UI;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.base.ScaledButton;
import com.mygdx.game.math.Rect;
import com.mygdx.game.screen.GameScreen;
import com.mygdx.game.sprite.Bullet;

public class StartNewGame extends ScaledButton {
    private GameScreen gameScreen;
    public StartNewGame(TextureAtlas atlas, GameScreen gameScreen) {
        super(atlas.findRegion("newGame"));
        this.gameScreen = gameScreen;
    }

    @Override
    public void update(float delta) {
        //анимация пульсации
        playAnimation();
        super.update(delta);
    }

    @Override
    public void action() {
        gameScreen.startNewGame();
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.08f);
        setTop(worldBounds.getTop() - 0.55f);
    }
}
