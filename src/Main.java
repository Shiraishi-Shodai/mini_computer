package src;
import src.big5Hardware.ControlUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("進数変換ちゃんです。よろしくです。");
        ControlUnit cu = new ControlUnit();
        cu.start();
    }
}