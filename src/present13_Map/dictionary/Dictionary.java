package present13_Map.dictionary;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Написать программу переводчик, которая будет переводить текст,
 * написанный на одном языке, на другой язык согласно заранее составленному словарю.
 *
 * Created by Alex on 13.01.2015.
 */
public class Dictionary {
    public static void main(String[] args) throws IOException {

        /*
        Есть два файла с рускими и англ. словами соответственно
        Обрабатываем файлы и делаем массивы
        
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("eng.txt"), "UTF-8"));
        List<String> rusDic = new ArrayList<String>();
        String slovo;
        while( (slovo = br.readLine() ) != null )
            rusDic.add(slovo);
        System.out.println(rusDic);
        br.close();

        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("rus.txt"), "windows-1251"));
        List<String> engDic = new ArrayList<String>();
        String word;
        while( (word = br2.readLine() ) != null )
            engDic.add(word);
        System.out.println(engDic);
        br2.close();


        BufferedReader size = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите слово: ");
        String slovoIn = size.readLine();

// Засовываем все в хэшкарту

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < rusDic.size(); i++) {
            map.put(rusDic.get(i), engDic.get(i));
        }
        
//Поиск без карты
        for (int i = 0; i < rusDic.size(); i++) {
            if (slovoIn.equals(rusDic.get(i))) {
                System.out.println("'"+engDic.get(i)+"'");
            }
        }
}
}
