public class Distance {
  double distance;

  public void print(){
    System.out.println("Hi from Distance");
  }

  static class Convert{
    public double convertFromMetersToKm(double distance){
      return distance / 100;
    }

    public double convertFromKmToMiles(double distance){
      return distance / 8;
    }
  }

  public static void main(String[] args) {
    Distance.Convert convert = new Convert();
    System.out.println(convert.convertFromKmToMiles(110.16));
    System.out.println(convert.convertFromMetersToKm(1200.005));
  }
}
