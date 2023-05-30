
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initiate Scanner
		

	}

	public static double getDensity(double mass, double volume) {
		return mass / volume;
	}

	public static double getMass(double density, double volume) {
		return density * volume;
	}

	public static double getVolume(double density, double mass) {
		return mass / density;
	}

}
