package com.kilobolt.zombiebird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.kilobolt.screens.GameScreen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kilobolt.zbHelpers.AssetLoader;


public class ZBGame extends Game {
//	SpriteBatch batch;
//	Texture img;
	
	@Override
    public void create() {

		Gdx.app.log("ZBGame", "created");
        AssetLoader.load();
        setScreen(new GameScreen());

	}

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }

}
