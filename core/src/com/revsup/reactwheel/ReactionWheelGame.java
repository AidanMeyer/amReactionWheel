package com.revsup.reactwheel;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.revsup.reactwheel.objects.Wheel;

public class ReactionWheelGame extends ApplicationAdapter {
	SpriteBatch batch;
	Wheel w;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		w = new Wheel(batch);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(225/255f,217/255f,149/255f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		w.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		w.dispose();
	}
}
