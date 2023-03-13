package Interfaces_And_Abstraction.Exercise.MilitaryElite.models;

import Interfaces_And_Abstraction.Exercise.MilitaryElite.interfaces.LieutenantGeneral;
import Interfaces_And_Abstraction.Exercise.MilitaryElite.interfaces.Private;
import java.util.Set;
import java.util.TreeSet;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {

    private Set<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new TreeSet<>((first, second) -> second.getId() - first.getId());
    }
    @Override
    public Set<Private> getPrivates() {
        return this.privates;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f", getFirstName(), getLastName(), getId(), getSalary())).append(System.lineSeparator());
        sb.append("Privates:");
        for (Private priv : this.privates) {
            sb.append(System.lineSeparator());
            sb.append("  ").append(priv.toString());
        }
        return sb.toString();
    }
}
