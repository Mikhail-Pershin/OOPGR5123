package OCP;

public class SpeedCalculation {
  public double calculateAllowedSpeed(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            return vehicle.getMaxSpeed() * 0.8;
        } else if (vehicle instanceof Bus) {
            return vehicle.getMaxSpeed() * 0.6;
        }

        return 0.0;
    }
}