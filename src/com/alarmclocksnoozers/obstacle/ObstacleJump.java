package com.alarmclocksnoozers.obstacle;

import android.graphics.Bitmap;
import com.alarmclocksnoozers.runnershigh.Sprite;
import com.alarmclocksnoozers.tools.Util;


public class ObstacleJump extends Obstacle {
	public Bitmap jumpSpriteImg;
	public Sprite jumpSprite = null;
	
	public ObstacleJump(float _x, float _y, float _z, float _width, float _height, char type, int _FrameUpdateTime, int _numberOfFrames){
		super(_x, _y, _z, _width, _height, type);
		
		jumpSprite = new Sprite(_x, _y, _z, _width, _height, _FrameUpdateTime, _numberOfFrames);
		jumpSprite.loadBitmap(Util.loadBitmapFromAssets("game_obstacle_jump_animated.png") );

		Util.getAppRenderer().addMesh(jumpSprite);
		
	}	
}
