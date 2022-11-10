package entity;

import java.util.Arrays;

public class AssignmentDriver {
    private BusDriver busDriver;
    private AssignmentRoute[] assignmentRoutes;
    private int totalRoute;

    public AssignmentDriver(BusDriver busDriver, AssignmentRoute[] assignmentRoutes) {
        this.busDriver = busDriver;
        this.assignmentRoutes = assignmentRoutes;
    }

    public BusDriver getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(BusDriver busDriver) {
        this.busDriver = busDriver;
    }

    public AssignmentRoute[] getAssignmentRoutes() {
        return assignmentRoutes;
    }

    public void setAssignmentRoutes(AssignmentRoute[] assignmentRoutes) {
        this.assignmentRoutes = assignmentRoutes;
    }

    public int getTotalRoute() {
        return totalRoute;
    }

    public void setTotalRoute(int totalRoute) {
        this.totalRoute = totalRoute;
    }

    @Override
    public String toString() {
        return "AssignmentDriver{" +
                "busDriver=" + busDriver +
                ", assignmentRoutes=" + Arrays.toString(assignmentRoutes) +
                '}';
    }

}
