package Olympics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Dog", "Dogovich", "Frend", 4, 5, 6),
                new Student("Вася", "Пупкин", "Васильевич", 7, 9, 10),
                new Student("Александр", "Александровский", "Александров", 10, 10, 10),
                new Student("Massimo", "Dutti", "Brendovich", 8, 8, 6),
                new Student("Van", "Vanics", "ivanich", 8, 4, 7)
        );

        List<String> topThreeStudents =
                students.stream()
                        .sorted(Comparator.comparing(Student::getAverageScore).reversed())
                        .limit(3)
                        .map(Student::getName)
                        .collect(Collectors.toList());

        System.out.println("Top three students: " + topThreeStudents);

//        public static void printTopThreeStudents (List<Student > students) {
//        List<Student> topThree = findTopNByAverageScore(3, students);
//        printStudents(topThree);
//    }
    }
}


