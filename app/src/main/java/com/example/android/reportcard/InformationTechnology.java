package com.example.android.reportcard;

/**
 * Created by carlo on 05/10/2017.
 */

public class InformationTechnology {

    private int Grade;
    private String Assignment;
    private int Type;

    public InformationTechnology(int grade, String assignment, int type) {
        Grade = grade;
        Type = type;
        Assignment = assignment;
    }

    public int getGrade() {
        return Grade;
    }

    public String getAssignment() {
        return Assignment;
    }

    public int getType() {
        return Type;
    }
}