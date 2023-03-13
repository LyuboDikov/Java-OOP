package Interfaces_And_Abstraction.Exercise.MilitaryElite.models;

import Interfaces_And_Abstraction.Exercise.MilitaryElite.interfaces.Engineer;
import Interfaces_And_Abstraction.Exercise.MilitaryElite.interfaces.Repair;

import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private Set<Repair> repairs;
    public EngineerImpl(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
    @Override
    public Set<Repair> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString() {
        return "EngineerImpl{" +
                "repairs=" + repairs +
                '}';
    }
}
