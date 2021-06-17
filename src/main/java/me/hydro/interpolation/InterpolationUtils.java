package me.hydro.interpolation;

import lombok.experimental.UtilityClass;
import me.hydro.interpolation.type.InterpolationType;
import me.hydro.interpolation.location.Location;

@UtilityClass
public class InterpolationUtils {

    public Location bruteforceInterpolate(InterpolationType type, Location a, Location b) {
        return bruteforceInterpolate(type, a, b, 0);
    }

    public Location bruteforceInterpolate(InterpolationType type, Location a, Location b, int increment) {
        switch (type) {
            case STANDARD: {
                double distanceAB = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)
                        + Math.pow((a.getY() - b.getY()), 2)
                        + Math.pow((a.getZ() - b.getZ()), 2));

                Location interpolated = new Location(a.getX() + ((b.getX() - a.getX()) / distanceAB),
                        a.getY() + ((b.getY() - a.getY()) / distanceAB),
                        a.getZ() + ((b.getZ() - a.getZ()) / distanceAB));

                Location finalInterpolatedLocation = null;

                while (true) {
                    Location interpolationToTry = new Location(Math.random(), Math.random(), Math.random());
                    if (interpolationToTry == interpolated) {
                        finalInterpolatedLocation = interpolationToTry;
                        break;
                    }
                }

                return finalInterpolatedLocation;
            }
            case MINECRAFT: {
                Location interpolated = new Location(a.getX() + ((b.getX() - a.getX()) / increment),
                        a.getY() + ((b.getY() - a.getY()) / increment),
                        a.getZ() + ((b.getZ() - a.getZ()) / increment));

                Location finalInterpolatedLocation = null;

                while (true) {
                    Location interpolationToTry = new Location(Math.random(), Math.random(), Math.random());
                    if (interpolationToTry == interpolated) {
                        finalInterpolatedLocation = interpolationToTry;
                        break;
                    }
                }

                return finalInterpolatedLocation;
            }
            default: {
                return null;
            }
        }
    }
}
