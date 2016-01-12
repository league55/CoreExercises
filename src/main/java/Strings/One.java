package Strings;

/**
 В каждом слове текста k-ю букву заменить заданным символом. Если
 step больше длины слова, корректировку не выполнять.
 */
public class One {

    private String theString;
    private String symbol;
    private int step;



    public String changeString(){
        StringBuilder stringBuiled = new StringBuilder(theString);
        int position = 0;
        while(position<stringBuiled.length()-1){
            position+=step;
            stringBuiled.replace(position-1, position, symbol);
        }
        System.out.println(stringBuiled.toString());

        return new String(stringBuiled);
    }


    public void setTheString(String theString) {
        this.theString = theString;
    }


    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getTheString() {
        return theString;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getStep() {
        return step;
    }
}
