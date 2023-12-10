package com.example.pushkin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String poem = "У Лукоморья дуб\n зелёный\n";

    private int numberB;
    private int numberW;
    private int lCount;
    private int words5;
    private int wordsAStroka;
private TextView infoApp;

    private List<String> findWordsStartingWith(String poem, String prefix) {
        List<String> words5 = new ArrayList<>();
        String[] allWords = poem.split("\\s+");
        for (String word : allWords) {
            int length = 0;
            if (word.length() == length) {
                words5.add(word);
            }
        }
        return words5;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberB = numberB(poem);
        numberW = numberW(poem);
        lCount = lCount(poem);
        String wordsAStroka = (wordsAStroka(poem));//отклонение
        infoApp = findViewById(R.id.infoApp);
        infoApp.setText("Число символов в строке" + numberB + "\n"
            + "Число слов в строке" + numberW + "\n"
            + "Число букв \"л\"" + lCount + "\n"
            + "Слов из 5ти букв" + words5 + "\n"
            + "Строка из слов, начинающихся на букву \"А\" " + wordsAStroka);
    }

    private int numberW(String stringPoem) {
String[] words = poem.split("\\s+");
return  words.length;
        }
    private  int countSpecificChar(String poem, char targetChar)  {
        int count = 0;
        for (char c : poem.toCharArray()) {
            if (c == targetChar) {
                count++;
            }
        }
        return  count;
    }
private  int lCount(String stringPoem) {//10000000000000000000000000001
        int count = 0;
        for (int i = 0; i < stringPoem.length(); i++) {
            if (stringPoem.charAt(i) == 'л' || stringPoem.charAt(i) == 'Л') {
                count ++;
            }

        }
return count;
    }//100000000000001
    private int numberB(String stringPoem) {
        return poem.length();
    }

    //fhghfgfgfgfggghllgkgjjkfkgjkdjkjiigjigjfigjijijij

private  String wordsAStroka(String sttingPoem) {
        String stringA = "";
        String stPoem = sttingPoem.replace("\n", " ").trim();
        String[] arrayPoem = stPoem.split(" ");

        for (String string : arrayPoem) {
            if (string.isEmpty()) continue;
            if (string.charAt(0) == 'а' | string.charAt(0) == 'А') {
                stringA += string + " ";
            }
        }
return stringA.trim();
    }







}