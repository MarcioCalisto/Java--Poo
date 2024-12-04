package edu.marcio.exemplos.gradebook;

// Figura 3.10: GradeBook.java
// Classe GradeBook com um construtor para inicializar o
// nome de um curso.

// import java.util.Scanner;

public class GradeBook {

    private String courseName; // nome do curso para esse gradeBook

    // o construtor inicializa courseName com o argumento String
    public GradeBook(String name) {
        courseName = name; // inicializa courseName
    } // fim do construtor

    public void setCourseName(String name) {
        courseName = name; // armazena o nome do curso
    } // fim do método setCourseName

    // método para recuperar o nome do curso
    public String getCourseName() {
        return courseName;
        // fim do método setCourseName
    }

    // exibe uma mensagem de boas-vindas para o user GradeBook
    public void displayMessage() {
        // essa instrução chama getCourseName para obter
        // nome do curso que esse GradeBook representa
        System.out.printf("Welcome to the Grade Book for\n%s!\n");
        getCourseName();
    } // fim do método displayMessage
} // fim da classe GradeBook
