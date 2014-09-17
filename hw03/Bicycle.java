//////////////////////////////////////
//Bicycle Program
//Russell Laros
//Hw03
//Program will prompt the user to enter two digits
//the first giving the number of counts on a cyclometer and 
//the second giving the number of seconds during which the counts occurred 
//and then prints out the distance traveled and the average miles per hour
import java.util.Scanner; //must import scanner to not get compiler errors

public class Bicycle { //adding class - public
    public static void main(String[] args) { //main method required for java programs
    Scanner myScanner; //create new scanner
    myScanner = new Scanner( System.in ); //new scanner now can accept input

    System.out.print("Enter number of counts: ");//prompt for number of counts
    double nCounts = myScanner.nextDouble();
    System.out.print("Enter the number of seconds in which the counts occured: ");//prompt for number of seconds which counts occurred
    double nSeconds = myScanner.nextDouble();
    
    double wheelDiameter=27.0, //Wheel Diameter
    PI=3.14159, //Value for Pi
    feetPerMile=5280, //Feet per mile, used for calculations
    inchesPerFoot=12, //inches per foot, used for calculations
    secondsPerMinute=60, //secs per foot
    secondsPerHour=3600; //secs per hour
    
    double distanceTrip=nCounts*wheelDiameter*PI; //setting up the distance of trip based counts and length of one tire revolution
    distanceTrip/=inchesPerFoot*feetPerMile; //converting distance to miles
    double minutesTrip=nSeconds/secondsPerMinute; //converting secs to minutes
    double hoursTrip=nSeconds/secondsPerHour; //converting minutes to hours
    double speedMPH=distanceTrip/hoursTrip; //finding average speed in miles per hours of trip
    
    System.out.printf("The trip in miles was %.2f ", distanceTrip); //print distance
    System.out.printf("\n The amount of minutes this trip took is %.2f", minutesTrip); //print amount of minutes trip took
    System.out.printf("\n The average speed of this trip was %.2f \n", speedMPH); //print average speed
    
    }
}