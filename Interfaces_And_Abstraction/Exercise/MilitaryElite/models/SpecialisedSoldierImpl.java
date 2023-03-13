package Interfaces_And_Abstraction.Exercise.MilitaryElite.models;

import Interfaces_And_Abstraction.Exercise.MilitaryElite.enums.Corps;

public class SpecialisedSoldierImpl extends PrivateImpl {

    private Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    public Corps getCorps() {
        return corps;
    }

    @Override
    public String toString() {
        return "SpecialisedSoldierImpl{" +
                "corps=" + getCorps().name() +
                '}';
    }
}
