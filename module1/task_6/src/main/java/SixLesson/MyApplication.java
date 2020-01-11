package SixLesson;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyApplication {
    public static void main(String[] args) {

        //Подскажите, пожалуйста, что я сделала не так что при сборке /SkillBox_1_6_jar/SkillBox_1.6.jar
        // при вызове из консоли  java -jar SkillBox_1_6_jar
        // Error: Unable to access jarfile SkillBox_1_6_jar
        // Получается собрала неправильно?
        // Хотела, чтобы можно было запускать с консоли как friend.jar


        // Lesson example (USA format)
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss:SS a MM/dd/yyyy");

        Date date = new Date();

        // My variant (Russian format)
        DateFormat dateFormat1 = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        System.out.println(dateFormat1.format(date));

    }
}
