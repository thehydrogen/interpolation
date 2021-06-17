# Hydro's BruteforceInterpolation
This library implements the extremely advanced Mathematical formula of "brute force interpolation" into a simple Java library.

## Usage
Standard brute force interpolation
```
Location a = new Location(x, y, z);
Location b = new Location(x, y, z);
InterpolationType type = InterpolationType.NORMAL;

Location interpolated = InterpolationUtils.bruteforceInterpolate(type, a, b);
```

Minecraft brute force interpolation
```
Location a = new Location(x, y, z);
Location b = new Location(x, y, z);
int increment = 0; // you must calculate this yourself!
InterpolationType type = InterpolationType.MINECRAFT;

Location interpolated = InterpolationUtils.bruteforceInterpolate(type, a, b, increment);
```

## Performance
This implementation is extremely performant. We have found that usually the operation is completed within the time before the heat death of the universe.

## License
You cannot use this commercially without explicit permission from Hydrogen Industries, LLC!
Please reach out to me by sending a letter;
```
Apt. 271
123 Interpolation Rd.
New Math, Connecticut
United States
```