//My name is Joey Carney
//Lab02
//September 03, 2014
//Cyclometer-Determines time elapsed and number of front wheel rotations

public class Cyclometer {
    public static void main(String[] args) {
        int secTrips1 = 480; //Determines number of seconds for Trip1
        int secTrips2 = 3220; //Determines number of seconds for Trip2
        int countTrips1 = 1561; //Determines number of rotations for Trip1
        int countTrips2 = 9037; //Determines number of rotations for Trip2
        double wheelDiameter = 27.0; //Sets the wheel Diameter
        double PI = 3.14159; //Sets value of PI
        int feetPerMile = 5280; //Sets number of feet per mile
        int inchesPerFoot = 12; //Sets number of inches per foot
        int secondsPerMinute = 60; //Sets number of seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance; //Sets values for distances for Trips 1 and 2, and sets total distanceTrip1
        System.out.println("Trip 1 took "+ (secTrips1/secondsPerMinute) + " minutes and had " + countTrips1 + " counts.");
        System.out.println("Trip 2 took "+ (secTrips2/secondsPerMinute) + " minutes and had " + countTrips2 + " counts.");
        distanceTrip1 = countTrips1*wheelDiameter*PI; //Gives distance1 in inches
        distanceTrip1 /= inchesPerFoot*feetPerMile; //Sets distance1 to miles
        distanceTrip2 = countTrips2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Sets distance2 to miles
        totalDistance = distanceTrip1 + distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); //Prints out distance for trip 1
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); //Prints out distance for trip 2
        System.out.println("The total distance was "+totalDistance+" miles"); //Prints out the total distance
        }
    }