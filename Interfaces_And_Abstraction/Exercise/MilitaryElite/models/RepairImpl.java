package Interfaces_And_Abstraction.Exercise.MilitaryElite.models;

import Interfaces_And_Abstraction.Exercise.MilitaryElite.interfaces.Repair;

public class RepairImpl implements Repair {
    private String partName;
    private String hoursWorked;

    public RepairImpl(String partName, String hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getPartName() {
        return partName;
    }

    @Override
    public String getHoursWorked() {
        return hoursWorked;
    }
}
