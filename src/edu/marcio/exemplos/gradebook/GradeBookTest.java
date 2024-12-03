package edu.marcio.exemplos.gradebook;

public class GradeBookTest {
        public static void main(String[] args) {

                // criar objeto GradeBook
                GradeBook myGradeBook1 = new GradeBook(
                                "CS101 Introduction to Java Programming");
                GradeBook myGradebook2 = new GradeBook(
                                "CS102 Data Structures in Java");

                // exibe valor inicial de courseName para cada GradeBook
                System.out.printf("gradeBook1 course name is: %s\n",
                                myGradeBook1.getCourseName());
                System.out.printf("gradeBook2 course name is: %s\n",
                                myGradebook2.getCourseName());
        } // fim do método
} // fim da classe
