
package oop.lab.employeedatabase;


/**
 *
 * @author Swapnil Das Saikat
 * ID: 20221101010
 */

public class EmployeeDatabase {
    public static void main(String[] args) {
  

        Teacher teacher1 = new Teacher(2, "Mahamudul Hassan Milon", "Math", "Calculus 101");
        Officer officer1 = new Officer(3, "Bihan", "Senior Officer");
        CasualTypist typist1 = new CasualTypist(4, "Utsho", 80, 100);
        RegularTypist typist2 = new RegularTypist(5, "Asif", 100);

        System.out.println("\nTeacher " + teacher1.getName() + " teaches " + teacher1.getSubject() + " and published " + teacher1.getPublication());
        System.out.println("\nOfficer " + officer1.getName() + " has grade " + officer1.getGrade());
        System.out.println("\nCasual typist " + typist1.getName() + " has speed " + typist1.getSpeed() + " and earns " + typist1.getDailyWages() + " daily wages");
        System.out.println("\nRegular typist " + typist2.getName() + " has speed " + typist2.getSpeed());
    }
}