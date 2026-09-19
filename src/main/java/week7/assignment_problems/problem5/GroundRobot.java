package main.java.week7.assignment_problems.problem5;
public class GroundRobot implements Trackable {

    private String id;

    public GroundRobot(String id) {
        this.id = id;
    }

    @Override
    public String getLocation() {
        return id + " at Sector 4";
    }

    static String getLocationIfTrackable(Object o) {

        if (o instanceof Trackable) {
            Trackable t = (Trackable) o;
            return t.getLocation();
        }

        return "Tracking not available";
    }

    public static void main(String[] args) {

        DeliveryDrone d = new DeliveryDrone("DR-1");
        ScoutDrone s = new ScoutDrone("SC-1");
        GroundRobot g = new GroundRobot("GR-1");

        System.out.println(getLocationIfTrackable(d));
        System.out.println(getLocationIfTrackable(s));
        System.out.println(getLocationIfTrackable(g));
    }
}