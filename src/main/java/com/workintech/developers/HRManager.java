package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("HRManager starts to working");
    }

    public void addEmployee(JuniorDeveloper developer) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = developer;
                System.out.println("JuniorDeveloper added successfully.");
                return;
            }
        }
        System.out.println("JuniorDeveloper array is full. Cannot add more.");
    }

    public void addEmployee(MidDeveloper developer) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = developer;
                System.out.println("MidDeveloper added successfully.");
                return;
            }
        }
        System.out.println("MidDeveloper array is full. Cannot add more.");
    }

    public void addEmployee(SeniorDeveloper developer) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = developer;
                System.out.println("SeniorDeveloper added successfully.");
                return;
            }
        }
        System.out.println("SeniorDeveloper array is full. Cannot add more.");
    }

}