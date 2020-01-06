package main.java;

public class Train extends Vehicle{
    private int numOfTrainCars;

    public Train(long id, int numOfTrainCars) {
        super(id);
        this.numOfTrainCars = numOfTrainCars;
    }

    public int getNumOfTrainCars() {
        return numOfTrainCars;
    }

    public void setNumOfTrainCars(int numOfTrainCars) {
        this.numOfTrainCars = numOfTrainCars;
    }

    @Override
    public void printDetails() {
        System.out.println("Train Id: " + getId() + ", Number of train cars: " + getNumOfTrainCars());
    }
}
