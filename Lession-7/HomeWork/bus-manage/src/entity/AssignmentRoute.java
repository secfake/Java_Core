package entity;

public class AssignmentRoute {
    private int numTurn;
    private BusRoute busRoute;

    public AssignmentRoute(int numTurn, BusRoute busRoute) {
        this.numTurn = numTurn;
        this.busRoute = busRoute;
    }

    public int getNumTurn() {
        return numTurn;
    }

    public void setNumTurn(int numTurn) {
        this.numTurn = numTurn;
    }

    public BusRoute getBusRoute() {
        return busRoute;
    }

    public void setBusRoute(BusRoute busRoute) {
        this.busRoute = busRoute;
    }

    @Override
    public String toString() {
        return "AssignmentRoute{" +
                "numTurn=" + numTurn +
                ", busRoute=" + busRoute +
                '}';
    }
}
