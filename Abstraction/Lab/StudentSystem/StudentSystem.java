package Abstraction.Lab.StudentSystem;

import java.util.HashMap;
import java.util.Map;
public class StudentSystem {
    private Map<String, Student> repo;
    public StudentSystem() {
        this.repo = new HashMap<>();
    }
    public void parseCommand(String[] inputData) {

        String command = inputData[0];

        if (command.equals("Create")) {

            String name = inputData[1];
            int age = Integer.parseInt(inputData[2]);
            double grade = Double.parseDouble(inputData[3]);

            if (!repo.containsKey(name)) {
                Student student = new Student(name, age, grade);
                repo.put(name, student);
            }
        } else if (command.equals("Show")) {

            String name = inputData[1];

            if (repo.containsKey(name)) {

                StringBuilder sb = new StringBuilder();
                Student student = repo.get(name);

                sb.append(String.format("%s is %s years old.", student.getName(), student.getAge()));

                if (student.getGrade() >= 5.00) {
                    sb.append(" Excellent student.");
                } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                    sb.append(" Average student.");
                } else {
                    sb.append(" Very nice person.");
                }
                System.out.println(sb);
            }
        }
    }
}
