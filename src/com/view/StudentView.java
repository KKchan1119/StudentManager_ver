package com.view;
import com.entity.Student;
public class StudentView {
    // 타이틀 출력
    public void printTitle() {
        System.out.println("=============================================================");
        System.out.println("학번\t이름\t\t국어\t영어\t수학\t물리\t총점\t평균\t");
        System.out.println("=============================================================");
    }

    // 본문 출력
    public void printAllStudents(Student[] stuArr, int stuMaxNo) {
        printTitle();

        for (int i = 0; i < stuMaxNo; i++) {
            System.out.printf("%3d\t%8s\t%3d\t%3d\t%3d\t%3d\t%3d\t%.1f%n",
                    stuArr[i].getStudentNumber(),
                    stuArr[i].getStudentName(),
                    stuArr[i].getKorScore(),
                    stuArr[i].getEngScore(),
                    stuArr[i].getMathScore(),
                    stuArr[i].getPhyScore(),
                    stuArr[i].getTotalScore(),
                    stuArr[i].getAvgScore()
            );
        }

        printTail();
    }

    // 꼬리 출력
    public void printTail() {
        System.out.println("=============================================================");
    }
}
