package src.big5Hardware;
import java.util.Arrays;
import src.Constants;
import src.customExceptions.*;

public class MemoryUnit {

    private  String inputData; // 入力されたそのままのデータ
    private int operand1;
    private int operand2;
    private String operator;
    private double result; // 演算結果

    // 入力データを保存する
    public void storeInput(String inputData) throws Exception {
        System.out.println("5. 記憶装置さん：　入力装置さんありがとう。渡されたデータは大切に記憶しておくね");
        this.inputData = inputData;
        
        String splitData [] = this.parseData();
        this.inputDataErrorCheck(splitData);

        // データを保存
        this.operand1 = Integer.parseInt(splitData[0]);
        this.operand2 = Integer.parseInt(splitData[2]);
        this.operator = splitData[1];
    }

    // 保存されたデータを演算子・オペランドに分解する
    public String [] parseData() {
        String splitData [] = this.inputData.trim().split(" ");
        return splitData;
    }

    // 入力データが正確に入力されているかチェック
    public void  inputDataErrorCheck(String [] splitData) throws Exception{
        /*データエラーのパターン
        1. スペースで区切ったときに配列の要素数が3でない
        2. オペランドを整数に変換できない。(値が大きすぎる場合や、小さすぎる場合は今回は無視する)
        3. 演算子が(+, -, *, ÷)以外の値
        */
       
        System.out.println("6. 記憶装置さん：　入力装置さんから受け取ったデータをチェックするね");

        // 1. スペースで区切ったときに配列の要素数が3でない
        if(splitData.length != Constants.EXPECTED_INPUT_DATA_SIZE) throw new InvalidArraySizeException("入力データ数が無効です");

        // 2. オペランドを整数に変換できない。(値が大きすぎる場合や、小さすぎる場合は今回は無視する)
        int operand1 = Integer.parseInt(splitData[0]);
        int operand2 = Integer.parseInt(splitData[2]);

        // 3. 演算子が(+, -, *, ÷)以外の値
        String inputOperator = splitData[1];

        if(Arrays.stream(Constants.VALID_OPERATORS.values()).map(Constants.VALID_OPERATORS::getValue).noneMatch(inputOperator::equals)) throw new InvalidOperatorException("演算子が無効です");
        
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
    public void storeResult(double result) {
        this.result = result;
    }
    public double getResult() {
        return this.result;
    }

    public String getInputData() {
        return inputData;
    }

    public void setInputData(String inputData) {
        this.inputData = inputData;
    }
}