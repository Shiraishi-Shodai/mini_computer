package src.big5Hardware;

import src.Constants.VALID_OPERATORS;

public class ArithmeticUnit {
    private double result;
    
    // 四則演算をして結果を返す
    public double  calculate(MemoryUnit memoryUnit) throws Exception{
        System.out.println("9. 演算装置さん：　はい。演算を行います。");

        // 記憶装置から演算対象のデータを受け取る
        int operand1 = memoryUnit.getOperand1();
        int operand2 = memoryUnit.getOperand2();
        String operator = memoryUnit.getOperator();
        
        VALID_OPERATORS match_operator_obj = VALID_OPERATORS.fromString(operator);
        this.result = match_operator_obj.apply(operand1, operand2);
        
        System.out.println("10. 演算装置さん：　 演算が完了しました。");
        return this.result;
    }

    public void sendToMemory(MemoryUnit memoryUnit) {
        System.out.println("11. 演算装置さん：　 演算結果を記憶装置に渡しておくね");
        memoryUnit.storeResult(this.result);
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}