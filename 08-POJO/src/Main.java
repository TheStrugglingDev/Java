public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S23101" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/05/1943",
                    "Java Masterclass"
            );
            System.out.println(s);
        }
        Student student = new Student("S2845025", "George",
                "01/10/1990", "Java Course");

        LPAStudent LPAstudent = new LPAStudent("S82910", "Anna",
                "01/02/1994", "Java Course");

        System.out.println(student);
        System.out.println(LPAstudent);

        student.setClassList(student.getClassList() + ", Java OCP exam 982");
//        LPAstudent.setClassList(LPAstudent.classList() + ", Java OCP exam 982"); Doesn't work! Records are IMMUTABLE
        
        System.out.println(student.getName() + " is taking " +
                student.getClassList());

        System.out.println(LPAstudent.name() + " is taking " +
                LPAstudent.classList());

    }
}
