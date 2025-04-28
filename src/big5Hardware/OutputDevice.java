package src.big5Hardware;

public class OutputDevice {
    public void displayResult(double  result) {
        System.out.println("演算結果は" + result + "です");
    }

    public void displayError(String outputErrorMessage) {
        System.err.println("出力装置さん" + outputErrorMessage);
    }
}