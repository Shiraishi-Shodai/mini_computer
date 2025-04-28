package src.big5Hardware;

public class OutputDevice {
    public void displayResult(int result) {
        System.out.println("演算結果は" + result + "です");
    }

    public void displayError(String outputErrorMessage) {
        System.err.print(outputErrorMessage);
    }
}