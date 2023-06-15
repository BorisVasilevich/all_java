//Дана строка sql-запроса "select * from students where ".
 //Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}



public class Main {
    public static void main(String[] args) {
        String s = " ";
        String start = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":null}";
        StringBuilder whereClause = new StringBuilder();

        String [] filterPairs = start.replaceAll("[{}\"]","").split(",");
        for (String pair:filterPairs){
            String[]keyValue = pair.split(":");
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();

            if (!value.equalsIgnoreCase("null")){
                if (whereClause.length() > 0){
                    whereClause.append(" ");
                }
                whereClause.append(key).append(" = ").append(value).append(" ");
            }
        }
        if (whereClause.length() == 0){
            s += "";
        }
        else{
            s += whereClause.toString();
        }

        System.out.println(s);
    }
}


//Дана json-строка (можно сохранить в файл и читать из файла)
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
//Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.

import java.nio.charset.StandardCharsets;
public class Mainman {
    public static void mains(String[] args) {
        //private static void SQL(StringBuilder builder1) {
        // String str = StandardCharsets.UTF_8
        //     .decode(str)
        //     .toString();
        String str = new String([{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]);
        str = StandardCharsets.UTF_8.encode(str).toString();
        str = str.replace("[", ",");
        str = str.replace("]", "");
        str = str.replace("{", "");
        String[][] strmass = new String[3][3];
        if (str.trim().length() != 0) {
            String[] strList1 = str.split("}");
            for (int i = 0; i < strList1.length; i++) {
                strList1[i] = strList1[i].replace("}", "");
                String[] strList2 = strList1[i].split(",");
                for (int j = 1; j < strList2.length; j++) {
                    strmass[i][j-1] = strList2[j].substring(strList2[j].indexOf(':') + 1).replace("\"", "");
                }
                System.out.println("Студент " + strmass[i][0] + " получил " + strmass[i][1] + " по предмету " + strmass[i][2] + ".");
            }
        } else
            System.out.println("Файл пустой");
    }
  
}



// *Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.
// *Дана строка: ".3 + 1.56 = " подсчитать результат и добавить к строке.


public class Mainss{
    public static void main(String[] args){
        String s = ".3 + 1.56=";
        long startTime = System.nanoTime(); // замер времени 1
        s = s.replaceAll("a", "A");
        double res = 1.86;
        s += res;
        long endTime = System.nanoTime();
        long durationString = (endTime - startTime);
        StringBuilder sb = new StringBuilder(".3 + 1.56 =");
        startTime = System.nanoTime(); // замер времени 2
        sb = sb.append(res);
        int alndex = sb.indexOf("a");
        if (alndex != -1){
            sb.replace(alndex, alndex + 1, "A");

        }
        endTime = System.nanoTime();
        long durationStringBuilder = (endTime - startTime);
        System.out.println("String duration:" + durationString);
        System.out.println("StringBuilder duration:" + durationStringBuilder);
    }

}

