package com.controller;

import com.entity.Student;
import com.entity.StudentEntity;
import com.view.StudentView;
public class Controller {
    StudentEntity studentEntity;
    StudentView studentView;

    public static int ERR_ARRAY_LENGTH = 0;
    public static int INFO_SUCCESS = 1;
    public static int DEFAULT_ARRAY_LENGTH = 6;

    public int initController(int arrLength, boolean sampleDataInsert){
        if(arrLength < 1) return Controller.ERR_ARRAY_LENGTH;

        if(arrLength<=5) arrLength = Controller.DEFAULT_ARRAY_LENGTH;
        studentEntity = new StudentEntity();
        initEntity(arrLength, sampleDataInsert);

        studentView = new StudentView();

        return Controller.INFO_SUCCESS;
    }

    public void initEntity(int arrLength, boolean sampleDataInsert){
        studentEntity.initStudentEntity(arrLength, sampleDataInsert);
    }
    public void searchAllStudent(){
        studentView.printAllStudents(studentEntity.getStuArr(), studentEntity.getNextArrIdx());
    }
    public int insertStudent(Student stu){
        int result = studentEntity.insertStudent(stu);
        return result;
    }
}
