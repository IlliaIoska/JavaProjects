import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public enum BodyTypes {
        STAR,
        PLANET,
        COMET,
        MOON
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }



    public boolean addSattelite(HeavenlyBody moon) {
        return satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }

//        System.out.println("object.getClass() = " + object.getClass());
//        System.out.println("this.getClass() = " + this.getClass());
//
//        if ((object == null) || (this.getClass() != object.getClass())) {
//            return false;
//        }

        if(object instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) object;
            return this.getKey().equals(theObject.getKey());
        }
        return false;

//        String objectName = ((HeavenlyBody) object).getName();
//        return this.name.equals(objectName);
    }

    @Override
    public final int hashCode() {
        return this.getKey().hashCode();
    }

    @Override
    public String toString() {
        return this.getKey().getName() + " : " + this.getKey().getBodyType() + ", " + this.getOrbitalPeriod();
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        public Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.getName().equals(((Key) obj).getName())) {
                return (this.getBodyType().equals(key.getBodyType()));
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.getName().hashCode() + 57 + this.getBodyType().hashCode();
        }

        @Override
        public String toString() {
            return "Name = " + this.getName() + " bodyType = " + this.getBodyType();
        }
    }
}
