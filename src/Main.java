package src;
import src.big5Hardware.ArithmeticUnit;
import src.big5Hardware.ControlUnit;
import src.big5Hardware.InputDevice;
import src.big5Hardware.MemoryUnit;
import src.big5Hardware.OutputDevice;

public class Main {
    public static void main(String[] args) {
        System.out.println("ミニコンピュータちゃんです。よろしくです😆");
        MemoryUnit memoryUnit = new MemoryUnit();
        InputDevice inputDevice = new InputDevice();
        OutputDevice outputDevice = new OutputDevice();
        ArithmeticUnit arithmeticUnit = new ArithmeticUnit();
        ControlUnit controlUnit = new ControlUnit(memoryUnit, inputDevice, outputDevice, arithmeticUnit);

        controlUnit.start();
        controlUnit.fetchInput();
        controlUnit.excuteOperation();
        controlUnit.outputResult();
        controlUnit.end();

    }
}