package Interfaces_And_Abstraction.Exercise.MilitaryElite.models;

import Interfaces_And_Abstraction.Exercise.MilitaryElite.interfaces.Commando;
import Interfaces_And_Abstraction.Exercise.MilitaryElite.interfaces.Mission;

import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {

    private Set<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }


    @Override
    public Set<Mission> getMissions() {
        return this.missions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f", getFirstName(), getLastName(), getId(), getSalary()));
        return sb.toString();
    }
}
