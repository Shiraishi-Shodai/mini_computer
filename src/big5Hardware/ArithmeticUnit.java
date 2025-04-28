package src.big5Hardware;

public class ArithmeticUnit {

    // 四則演算をして結果を返す
    public int calculate(MemoryUnit memoryUnit) {

        // 記憶装置から演算対象のデータを受け取る
        int operand1 = memoryUnit.getOperand1();
        int operand2 = memoryUnit.getOperand2();
        String operator = memoryUnit.getOperator();
        return operand1 + operand2;
    }

    // 例外を投げるヘルパー関数
    // public void throwError(String message) {
    //     throw Error(message);
    // }
}