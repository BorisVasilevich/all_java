//Дана строка sql-запроса "select * from students where ".
 //Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

//Дополнительные задания

//Дана строка 
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
//Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.

//*Сравнить время выполнения замены символа "а" на "А" любой строки содержащей
// >1000 символов средствами String и StringBuilder.
//*Дана строка: ".3 + 1.56 = " подсчитать результат и добавить к строке.

//import java.util.Map;

public class H2 {
    public static void h (String [] args) {
        StringBuilder s = new StringBuilder ("name Ivanov country Russia city Moscow age null");
        

        System.out.println(s);

    }    
}

