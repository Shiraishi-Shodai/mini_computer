package src.big5Hardware;

public class MemoryUnit {
// 入力されたそのままのデータ
    private  String inputData;
    private int operand1;
    private int operand2;
    private String operator;
    private int result;

// 入力データを保存する
    public void storeInput(String inputData) {
        this.inputData = inputData;
    }

// 保存されたデータを演算子・オペランドに分解する
    public void parseData() {
    }

    public int getOperand1() {
        return this.operand1;
    }
    public int getOperand2() {
        return this.operand2;
    }

    public String getOperator() {
        return this.operator;
    }
    
    // → 演算結果を保存する
    public void storeResult(int result) {
        this.result = result;
    }
    public int getResult() {
        return this.result;
    }
}