package Olympics;


import java.util.ArrayList;
import java.util.List;


public class Student {

    private String name;
    public String surname;
    public String patronymic;
    public List<Integer> score = new ArrayList<>();
    public int scoreOne;
    public int scoreTwo;
    public int scoreThree;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public List<Integer> getScore() {
        return score;
    }

    public void setScore(List<Integer> score) {
        this.score = score;
    }

    public static void winner(List<Student> student) {
        List<Student> Student = new ArrayList<>();
    }

    public static double getAverageScore(Student student) {
        double sum = 0.0;
        for (int score : student.getScore()) {
            sum += score;
        }
        return sum / student.getScore().size();
    }
    public static int compareByAvgScoreDesc(Student s1, Student s2) {
        return Double.compare(getAverageScore(s2), getAverageScore(s1));
    }
    public static List<Student> findTopNByAverageScore(int n, List<Student> students) {
        List<Student> copy = new ArrayList<>(students);
        copy.sort(Student::compareByAvgScoreDesc);
        return copy.subList(0, Math.min(n, copy.size()));
    }
    static void printStudents(List<Student> top) {
        int place = 1;
        for (Student s : top) {
            System.out.printf("Место %d. %s, %s %s: ср.балл %.3f%n",
                    place++, s.getSurname(), s.getName(), s.getPatronymic(), getAverageScore(s)
            );
        }
    }

    public Student(String name, String surname, String patronymic, int scoreOne, int scoreTwo, int scoreThree) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;

        this.scoreOne = scoreOne;
        this.scoreTwo = scoreTwo;
        this.scoreThree = scoreThree;
        score.add(scoreOne);
        score.add(scoreTwo);
        score.add(scoreThree);

    }
}




