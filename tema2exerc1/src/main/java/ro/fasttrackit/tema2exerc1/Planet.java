package ro.fasttrackit.tema2exerc1;

public enum Planet
{
	MERCURY(0.3),
	VENUS(0.9),
	MOON(0.1),
	MARS(0.3),
	JUPITER(2.5),
	SATURN(1),
	URANUS(0.8),
	NEPTUNE(1.1),
	PLUTO(0),
	IO(0.18),
	EUROPA(0.13),
	GANYMEDE(0.14),
	CALLISTO(0.2),
	SUN(27),
	WHITE_DWARF(1300000);
	
	double weightRatio = 1.0;
	
	// in enumuri, constructorii pot fi doar privati
	private Planet(double weightRatio)
	{
		if(weightRatio >= 0)
			this.weightRatio = weightRatio;
	}
	
	// metoda ce returneaza greutatea pe care ar avea-o un obiect pe planeta corespunzatoare enum-ului
	public double getWeightEquivalent(double weightOnEarth) { return this.weightRatio * weightOnEarth; }
	
	// metoda ce returneaza coeficientul de greutate, in cazul in care cineva ar avea nevoie
	public double getWeightRatio() { return this.weightRatio; }
	
	// se suprascrie metoda toString() pt. a afisa mai frumos numele valorilor enum-ului
	@Override
	public String toString()
	{ return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase(); }
}
