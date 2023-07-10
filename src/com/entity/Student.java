package com.entity;

public class Student {
    int studentNumber;
    String studentName;
    int korScore;
    int engScore;
    int mathScore;
    int phyScore;
    public int getStudentNumber(){
        return studentNumber;
    }
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public int getKorScore(){
        return korScore;
    }
    public void setKorScore(int korScore){
        this.korScore = korScore;
    }
    public int getEngScore(){
        return engScore;
    }
    public void setEngScore(int engScore){
        this.engScore = engScore;
    }
    public int getMathScore(){
        return mathScore;
    }
    public void setMathScore(int mathScore){
        this.mathScore = mathScore;
    }
    public int getPhyScore(){
        return phyScore;
    }
    public void setPhyScore(int phyScore){
        this.phyScore = phyScore;
    }
    public int getTotalScore(){
        return korScore+engScore+mathScore+phyScore;
    }

    public float getAvgScore(){
        return getTotalScore()/3.0f;
    }


}
