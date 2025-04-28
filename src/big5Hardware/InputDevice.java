package src.big5Hardware;
import java.util.Scanner;

public class InputDevice {
    private String inputData;

    // 入力データを受け取る
    public void receiveInput() {
        System.out.print("③入力装置さん：　はい。キーボード入力を受け付けます。\n以下のフォーマットで入力を行ってください。\nオペランド<space>演算子(+, -, *, ÷)<space>オペランド： ");
        Scanner sc = new Scanner(System.in);
        this.inputData = sc.nextLine();
    }
    
    // 入力されたデータを記憶装置に保存
    public void sendToMemory(MemoryUnit memoryUnit) {
        System.out.print("④入力装置さん：　記憶装置さん、ユーザーさんから入力されたデータを渡しておくね！");
        memoryUnit.storeInput(inputData);
    }
}