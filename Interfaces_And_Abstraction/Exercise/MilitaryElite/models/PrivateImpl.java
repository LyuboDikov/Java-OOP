package Interfaces_And_Abstraction.Exercise.MilitaryElite.models;

import Interfaces_And_Abstraction.Exercise.MilitaryElite.interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {

    private double salary;
    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }
    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f", getFirstName(), getLastName(), getId(), getSalary()));

        return sb.toString();
    }
}
