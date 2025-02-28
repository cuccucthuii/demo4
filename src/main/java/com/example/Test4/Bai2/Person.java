package com.example.Test4.Bai2;

public class Person {
    private String id;
    private String ten;
    private int tuoi;
    private float salary;
    private int yearOfWork;
    private String department;

    public Person(String id, String ten, int tuoi, float salary, int yearOfWork, String department) {
        if (id == null || id.trim().isEmpty() || ten == null || ten.trim().isEmpty() || department == null || department.trim().isEmpty()){
            throw new IllegalArgumentException("Vui long nhap du thong tin");
        }
        if (tuoi < 1 || tuoi > 100){
            throw new IllegalArgumentException("Tuoi khong hop le");
        }
        if (salary < 0 || salary > 200000000){
            throw new IllegalArgumentException("salary khong hop le");
        }
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.salary = salary;
        this.yearOfWork = yearOfWork;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getYearOfWork() {
        return yearOfWork;
    }

    public void setYearOfWork(int yearOfWork) {
        this.yearOfWork = yearOfWork;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", salary=" + salary +
                ", yearOfWork=" + yearOfWork +
                ", department='" + department + '\'' +
                '}';
    }
}
