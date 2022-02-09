package introconstructor;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson(int person){
        numberOfPeople = numberOfPeople + person;
    }

    public void ride(double km){
        kms = kms + km;
    }

    public static void main(String[] args) {
        CyclingTour cTour = new CyclingTour("Tour de France", LocalDate.of(2022, 2, 9));
        System.out.println(cTour.getDescription());
        System.out.println(cTour.getStartTime());
        System.out.println(cTour.getNumberOfPeople());
        System.out.println(cTour.getKms());

        cTour.registerPerson(2);
        cTour.registerPerson(1);

        cTour.ride(10);
        cTour.ride(9.5);

        System.out.println("---------------------------");
        System.out.println(cTour.getDescription());
        System.out.println(cTour.getStartTime());
        System.out.println(cTour.getNumberOfPeople());
        System.out.println(cTour.getKms());
    }
}
