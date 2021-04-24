package com.company;

public class Student {
    private String name;
    private String group;
    private int[] grade;

    public Student(String name, String group, int[] grade) {
     this.name = name;
     this.group = group;
     this.grade = grade;

    }

    public static void printTheBest(Student[] people) {
        boolean isBest = true;
        for (Student stud : people) {
            for(int mark : stud.grade) {
                // We assume our grade line from 0 to 10
                if (mark < 9) {
                    isBest = false;
                    break;
                }
            }
            if (isBest) {
                System.out.print(stud.name + " - ");
                System.out.println(stud.group);
            }
        }
    }


    public static void main(String[] args) {

        Student[] testStudent = new Student[10];
        String[] name =  new String[] {"Rezapova V.A.", "Pupkin V.I",
        "Kokovihin I.F", "Jabronbek S.A", "Usoltcev D.U",
        "Golovach L.G.", "Grey A.A.", "Mingaleev A.R.", "Kozlova D.O",
        "Kazachkov S.A."};
        String[] group = new String[] {"F1488", "01-505", "M4315",
                "C2017", "03-3469",
                "F1337", "02-503",
                "M4315", "P1525", "03-666"};

        int[][] grades = new int[][] {{9, 9, 10, 10, 10},
                                      {1, 2, 3, 4, 5},
                                      {10, 8, 7, 10, 4},
                                      {5, 4, 3, 2, 0},
                                      {8, 8, 8, 8, 7},
                                      {3, 0, 10, 6, 9},
                                      {1, 9, 9, 7, 4},
                                      {2, 0, 0, 0, 0},
                                      {3, 4, 6, 9, 7},
                                      {9, 9, 10, 4, 5}};

        // fill array by students
        for (int i = 0; i < 10; i++) {
            testStudent[i] = new Student(name[i], group[i], grades[i]);
        }

        printTheBest(testStudent);
    }


}
