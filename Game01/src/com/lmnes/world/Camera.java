package com.lmnes.world;

public class Camera {

	public static int x = 0;
	public static int y = 0;
	
	//clamp serve para limitar o mapa go game 
	public static int clamp(int atual, int min, int max) {
		if(atual < min) {
			atual = min;
		}
		
		if(atual > max) {
			atual = max;
		 }
		return atual;
	}
	
}
