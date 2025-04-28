package src.big5Hardware;

public class InputDevice {
    private String inputData;

    // 入力データを受け取る
    public void receiveInput() {

    }
    
    // 入力されたデータを記憶装置に保存
    public void sendToMemory(MemoryUnit memoryUnit) {
        memoryUnit.storeInput(this.inputData);
    }
}