public class Student {
    private int[] marks;
    private char[] grade;
    
    public Student(int[] marks) {
        this.marks = marks;
    }

    public void findGrade() {
        this.grade = new char[marks.length];
        for(int i = 0; i < marks.length; i++) {
            int result = marks[i];

            if(result >= 92) 
                grade[i] = 'E';
            else  if(result >= 85 && result <= 92) 
                grade[i] = 'A';
            else if(result >= 70 && result <= 85) 
                grade[i] = 'B';
            else if(result >= 65 && result <= 70)
                grade[i] = 'C';
            else if(result < 65)
                grade[i] = 'D';

        }
    }

    public int[] getMarks() {
        return this.marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public char[] getGrade() {
        return this.grade;
    }

    public void setGrade(char[] grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        System.out.println(30 % 5 == 0 && 30 % 3 == 0);
    }

}
