package com.test;
import com.entity.Student;
import com.entity.StudentEntity;
import com.controller.Controller;
import java.util.Scanner;
public class StudentManagerAppTest {
    public static void main(String[] args){
        Controller controller = new Controller();
        initControllerTest(controller);
        insertStudentTest(controller);
        insertStudentTest(controller);
    }



    public static void initControllerTest(Controller controller) {
        //배열길이 5, 샘플데이터 입력하겠다.
        int result = controller.initController(5, true);

        if(result == Controller.INFO_SUCCESS) {
            controller.searchAllStudent();
        }else {
            System.out.println("프로그램에서 사용할 배열의 길이 재확인 요망.");
        }

    }


    public static void insertStudentTest(Controller controller) {
        //학생 객체 생성
        Student stu = new Student();
        Scanner in = new Scanner(System.in);
        stu.setStudentName(in.nextLine());
        stu.setKorScore(in.nextInt());
        stu.setEngScore(in.nextInt());
        stu.setMathScore(in.nextInt());
        stu.setPhyScore(in.nextInt());
        int result = controller.insertStudent(stu);
        if(result == StudentEntity.ERR_ARRAY_FULL) {
            System.out.println("배열에는 저장할 공간이 없습니다.");
        }else {
            controller.searchAllStudent();
        }
    }
}
