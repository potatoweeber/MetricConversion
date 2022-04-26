
/**
 * Write a description of class MetricConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MetricConversion
{
  public double InchesToCent(double INCH) 
  {
    double Centimeters; 
    Centimeters = INCH * 2.54; 
    System.out.print(Centimeters);
    return Centimeters; 
  }
  public double FeetToCent(double Feet)
  {
    double Centimeters; 
    Centimeters = Feet * 30;
    System.out.print(Centimeters); 
    return Centimeters; 
  }
  public double YardsToMeters(double Yards) 
  {
   double Meters; 
   Meters = Yards * 0.91; 
   System.out.print(Meters); 
   return Meters; 
  }
  public double MilesToKilo(double Miles)
  {
  double Kilometers; 
  Kilometers = Miles * 1.609; 
  System.out.print(Kilometers); 
  return Kilometers; 
  }
  public double CentToInch(double Centimeters) 
  {
  double inches;
  inches = Centimeters / 2.54; 
  System.out.print(inches); 
  return inches; 
  }
  public double CentTofeet(double Centimeters)
  {
   double feet; 
   feet = Centimeters / 30.48; 
   System.out.print(feet); 
   return feet; 
  }
  public double MetersToYard(double Meters)
  {
   double Yards; 
   Yards = Meters / 1.094; 
   System.out.print(Yards); 
   return Yards; 
  }
  public double KilometersToMiles(double Kilometers) 
  {
   double Miles; 
   Miles = Kilometers / 1.609; 
   System.out.print(Miles); 
   return Miles; 
  }
}  

