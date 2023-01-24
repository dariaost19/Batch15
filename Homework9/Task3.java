package Homework9;

public class Task3 {
    public static void main(String[] args) {
        //1) Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        // Then your program should print name of the students that has A and B grad
        String[][] students = {{"Daria", "Alice", "Olivia", "Mettew"},
                                    { "A","B","C","D"},};


        for (int i = 0; i < students.length ; i++) {
            for (int j = 0; j <students[i].length; j++) {
               if(students[i][j].equals("A") || students[i][j].equals("B")){
                    System.out.println(students[0][j]);
                }

            }

        }

        }

}
