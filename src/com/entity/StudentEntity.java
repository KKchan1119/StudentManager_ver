package com.entity;
public class StudentEntity {
    Student[] stuArr;
    int nextArrIdx;
    int stuNextNumber;
    boolean stuArrStatus = false;

    public static int SAMPLE_DATA_COUNT =5;
    public static boolean ARRAY_STATUS_FULL = true;
    public static boolean ARR_STATUS_NO_FULL = false;
    public static int ERR_ARRAY_FULL = 2;
    public Student[] getStuArr(){
        return stuArr;
    }
    public int getNextArrIdx(){
        return nextArrIdx;
    }
    public int initStudentEntity(int arrLength, boolean sampleDataInsert){
        stuArr = new Student[arrLength];
        if(sampleDataInsert && arrLength > StudentEntity.SAMPLE_DATA_COUNT){

            for(int i = 0; i < StudentEntity.SAMPLE_DATA_COUNT; i++){
                Student student = new Student();
                student.studentNumber = i + 1;
                student.studentName = "Student" + student.studentNumber;
                student.korScore = 100 - (i * 10);
                student.engScore = 100 - (i * 10);
                student.mathScore = 100 - (i * 10);
                student.phyScore = 100 - (i * 10);
                stuArr[i] = student;

                nextArrIdx = i + 1;
                stuNextNumber = student.studentNumber +1;
            }
            return arrLength;
        }else {
            return 0;
        }
    }


    public int insertStudent(Student stu){

        if(stuArrStatus) return ERR_ARRAY_FULL;

        stu.setStudentNumber(stuNextNumber);
        stu.setStudentName(stu.getStudentName() + stuNextNumber);
        stuArr[nextArrIdx] = stu;

        stuNextNumber += 1;
        nextArrIdx += 1;

        if (stuArr.length == nextArrIdx)
            stuArrStatus = StudentEntity.ARRAY_STATUS_FULL;
        else
            stuArrStatus = StudentEntity.ARR_STATUS_NO_FULL;

        return nextArrIdx;
    }
}
