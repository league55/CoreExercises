package Strings;

import java.util.ArrayList;

/**
* В русском тексте каждую букву заменить ее порядковым номером
* в алфавите. При выводе в одной строке печатать текст с двумя пробе-
* лами между буквами, в следующей строке внизу под каждой буквой
* печатать ее номер.
 */
public class Two {


    private String theString;
    private String number;

    private ArrayList<String> list = new ArrayList();
    private String[] ALPHABET =  {" ", "а", "б", "в", "г", "д",
            "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о",
            "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э","ю", "я"};

   public Two(){
        for(String s:ALPHABET) list.add(s);
        }





    public String changeString() {

        String[] arraySymbols = theString.toLowerCase().split("");
        int[] arrayNumbers = new int[arraySymbols.length];
        StringBuilder returnedString = new StringBuilder("");

        for (int i = 0; i < arraySymbols.length; i++) {

            arrayNumbers[i] = list.indexOf(arraySymbols[i]);

        }
        //Have now array of symbols and array of numbers;

        for (String s : arraySymbols) {
            returnedString.append(s + "  ");
        }

        returnedString.append("\n");

        for (int n:arrayNumbers) {

            returnedString.append(n + "  ");
        }
        return new String(returnedString);

    }


    public void setTheString(String theString) {
        this.theString = theString;
    }



    public String getTheString() {
        return theString;
    }


}
