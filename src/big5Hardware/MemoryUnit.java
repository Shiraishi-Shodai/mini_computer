package src.big5Hardware;
import java.util.Arrays;
import src.customErros.*;

public class MemoryUnit {
// 入力されたそのままのデータ
    private  String inputData;
    private int operand1;
    private int operand2;
    private String operator;
    private int result;

    // 入力データを保存する
    public void storeInput(String inputData) throws Exception {
        System.out.print("⑤記憶装置さん：　入力装置さんありがとう。渡されたデータは大切に記憶しておくね");
        this.inputData = inputData;
        
        String splitData [] = this.parseData();
        this.inputDataErrorCheck(splitData);

        // データを保存
        this.operand1 = Integer.parseInt(splitData[0]);
        this.operand2 = Integer.parseInt(splitData[2]);
        this.operator = splitData[1];
    }

    public void  inputDataErrorCheck(String [] splitData) throws Exception{
        /*データエラーのパターン
        1. スペースで区切ったときに配列の要素数が3でない
        2. オペランドを整数に変換できない。(値が大きすぎる場合や、小さすぎる場合は今回は無視する)
        3. 演算子が(+, -, *, ÷)以外の値
        */
       
        System.out.print("⑥記憶装置さん：　入力装置さんから受け取ったデータをチェックするね");

        // 1. スペースで区切ったときに配列の要素数が3でない
        if(splitData.length != 3) throw new InvalidArraySizeException("入力データ数が無効です");

        // 2. オペランドを整数に変換できない。(値が大きすぎる場合や、小さすぎる場合は今回は無視する)
        int operand1 = Integer.parseInt(splitData[0]);
        int operand2 = Integer.parseInt(splitData[2]);

        // 3. 演算子が(+, -, *, ÷)以外の値
        String operators [] = {"+", "-", "*", "/"};
        String inputOperator = splitData[1];
        
        if(Arrays.stream(operators).noneMatch(inputOperator::equals)) throw new InvalidOperatorException("演算子が無効です");
        
    }

    // 保存されたデータを演算子・オペランドに分解する
    public String [] parseData() {
        String splitData [] = this.inputData.split(" ");
        return splitData;
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

    public String getInputData() {
        return inputData;
    }

    public void setInputData(String inputData) {
        this.inputData = inputData;
    }
}