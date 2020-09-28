import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        double startingLatitude;
        double startingLongitude;
        double endingLatitude;
        double endingLongitude;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the latitude of the starting location: ");
        startingLatitude = in.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        startingLongitude = in.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        endingLatitude = in.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        endingLongitude = in.nextDouble();

        
        GeoLocation myGeolocation = new GeoLocation(startingLatitude, startingLongitude);
        GeoLocation alsoMyGeolocation = new GeoLocation(endingLatitude, endingLongitude);
        System.out.println("The distance is " + myGeolocation.distanceFrom(alsoMyGeolocation) + " miles.");
        
    }
}