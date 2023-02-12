package Mates;

import java.lang.Math;

public class Matematicas{
	public static double generarNumeroPi(long pasos){
		long aciertos= 0;
		long areaCuadrado= 4;
		int i= 1;

		for(i=1; i<= pasos; i++){
			double x= (Math.random()*2)-1;
			double y= (Math.random()*2)-1;
			double distancia= Math.sqrt((x*x)+(y*y));
			if (distancia<=1){
				aciertos ++;
			}

		} 
		return (double)(areaCuadrado*aciertos/pasos);
	}
}

