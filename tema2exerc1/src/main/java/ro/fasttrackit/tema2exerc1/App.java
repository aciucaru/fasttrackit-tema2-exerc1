package ro.fasttrackit.tema2exerc1;

/*
Creaza un enum care modeleaza gravitatea pe diferite corpuri ceresti si are o metoda care returneaza echivalentul greutatii de pe Terra. 

Pentru simplitate vom folosi un ratio simplu pentru a face transformarea:

MERCURY: 0.3

VENUS: 0.9

MOON: 0.1

MARS: 0.3

JUPITER: 2.5

SATURN: 1

URANUS: 0.8

NEPTUNE: 1.1

PLUTO: 0

IO: 0.18

EUROPA: 0.13

GANYMEDE: 0.14

CALLISTO: 0.12

SUN: 27

WHITE_DWARF: 1300000
 */

public class App 
{
    public static void main( String[] args )
    {
        Planet planet1 = Planet.MOON;
        Planet planet2 = Planet.MARS;
        Planet planet3 = Planet.SUN;
        
        // Exemplu de utilizare:
        double personWeight = 70; // 70 kg
        double carWeight = 1300; // 1300 kg
        
        System.out.println("Weight of average person is (in kg):");
	        System.out.println("    on Earth: " + personWeight);
	        System.out.println("    on " + Planet.MOON + ": " + Planet.MOON.getWeightEquivalent(personWeight));
	        System.out.println("    on " + Planet.MARS + ": " + Planet.MARS.getWeightEquivalent(personWeight));
	        System.out.println("    on " + Planet.SUN + ": " + Planet.SUN.getWeightEquivalent(personWeight));
	        
	    System.out.println("Weight of average car is (in kg):");
        System.out.println("    on Earth: " + carWeight);
        System.out.println("    on " + Planet.MOON + ": " + Planet.MOON.getWeightEquivalent(carWeight));
        System.out.println("    on " + Planet.MARS + ": " + Planet.MARS.getWeightEquivalent(carWeight));
        System.out.println("    on " + Planet.SUN + ": " + Planet.SUN.getWeightEquivalent(carWeight));
    }
}
