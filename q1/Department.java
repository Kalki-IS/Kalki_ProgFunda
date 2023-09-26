package com.gradedproject.q1;

class SuperDepartment {
    public String departmentName() {
        return "Super Department";
    }

    public String getTodaysWork() {
        return "No work as of now";
    }

    public String getWorkDeadline() {
        return "Nil";
    }

    public String isTodayAHoliday() {
        return "Today is not a holiday";
    }
}

class AdminDepartment extends SuperDepartment {
    public String departmentName() {
        return "Admin Department";
    }

    public String getTodaysWork() {
        return "Complete your document submission";
    }

    public String getWorkDeadline() {
        return "Complete it by EOD";
    }
}

class HrDepartment extends SuperDepartment {
    public String departmentName() {
        return "HR Department";
    }

    public String getTodaysWork() {
        return "Fill out today’s timesheet and mark your attendance";
    }

    public String getWorkDeadline() {
        return "Complete it by EOD";
    }

    public String doActivity() {
        return "Team lunch";
    }
}

class TechDepartment extends SuperDepartment {
    public String departmentName() {
        return "Tech Department";
    }

    public String getTodaysWork() {
        return "Complete coding of Module 1";
    }

    public String getWorkDeadline() {
        return "Complete it by EOD";
    }

    public String getTechStackInformation() {
        return "Core Java";
    }
}

public class Department {
    public static void main(String[] args) {
        AdminDepartment adminDepartment = new AdminDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();

        System.out.println("Welcome to the " + adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to the " + hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to the " + techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(techDepartment.isTodayAHoliday());
    }
}
