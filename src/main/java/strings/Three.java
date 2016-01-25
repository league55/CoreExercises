package strings;

/**
 * В тексте после буквы Р, если она не последняя в слове, ошибочно напе-
 * чатана буква А вместо О. Внести исправления в текст
 */
public class Three {


    public String repairWord(String word) {

        int position = word.indexOf("ра");
        if (word.charAt(position + 1) == 'а') {
            word = word.replace("ра", "ро");

        }
        return word;
    }

    public String repairText(String text) {
        String[] words = text.split(" ");
        String repairedText = "";
        for (String word : words) {
            repairedText = repairedText + " " + repairWord(word);

        }

        return repairedText;
    }

}
