package Interfaces_And_Abstraction.Exercise.MilitaryElite.models;

import Interfaces_And_Abstraction.Exercise.MilitaryElite.interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return codeNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Name: %s %s Id: %d", getFirstName(), getLastName(), getId())).append(System.lineSeparator());
        sb.append(String.format("Code Number: %s", getCodeNumber()));
        return sb.toString();
    }
}
