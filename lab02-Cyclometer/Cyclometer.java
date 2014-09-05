///////////////////////////
//Russell Laros
//9-3-14
//CSE02-Lab-Cyclometer
//
public class Cyclometer {
    //must give main method
    public static void main(String[] args) {
        int secsTrip1=480; //
        int secsTrip2=3220; //
        int countsTrip1=1561; //
        int countsTrip2=9037; //
        double wheelDiameter=27.0, //
        PI=3.14159, //
        feetPerMile=5280, //
        inchesPerFoot=12, //
        secondsPerMinute=60; //
        double distanceTrip1, distanceTrip2, totalDistance;
        
        
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)
        +" minutes and had "+ countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)
        +" minutes and had "+ countsTrip2+" counts.");
        //run the calculations - store the calculations - calculating trip data
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above is distance in inches
        //for each count a rotation of the wheel travels the diameter*PI
        distanceTrip1/=inchesPerFoot*feetPerMile; //Distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        //code complete
    } //end of main method
} //end of class