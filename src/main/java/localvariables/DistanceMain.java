package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(4.7,true);
        System.out.println(distance.getDistanceInKm()+ " Exact(" + distance.isExact() + ")");

        int intDistance = (int)distance.getDistanceInKm();
        System.out.println(intDistance);
    }
}
