import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody mercury = new Planet("Mercury", 88);
        solarSystem.put(mercury.getKey(), mercury);
        planets.add(mercury);

        HeavenlyBody venus = new Planet("Venice", 225);
        solarSystem.put(venus.getKey(), venus);
        planets.add(venus);

        HeavenlyBody earth = new Planet("Earth", 365);
        solarSystem.put(earth.getKey(), earth);
        planets.add(earth);

        HeavenlyBody moon = new Moon("Moon", 27);
        solarSystem.put(moon.getKey(), moon);
        moon.addSattelite(moon);

        System.out.println("Printing planets");

        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getKey());
        }

        earth.addSattelite(moon);

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Earth", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());

        for (HeavenlyBody earthMoon : body.getSatellites()) {
            System.out.println(earthMoon);
            System.out.println(earthMoon.getKey() + " is Earth's moon");
        }
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("all moons");
        for (HeavenlyBody satellite : moons) {
            System.out.println(satellite.getKey());
        }

        HeavenlyBody pluto = new Star("Pluto", 842);
        planets.add(pluto);

        for (HeavenlyBody planet : planets) {
            System.out.println(planet.getKey() + ": " + planet.getOrbitalPeriod());
        }

        Object object = new Object();
        object.equals(object);
        "pluto".equals("");

        // confirming that equals works as needed
        HeavenlyBody earth1 = new Planet("Earth", 123);
        HeavenlyBody earth2 = new Planet("Earth", 123);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));

        for(HeavenlyBody solarSystemBody : solarSystem.values()) {
            System.out.println(solarSystemBody);
        }

    }
}