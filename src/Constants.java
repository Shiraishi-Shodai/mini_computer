package src;

public final class Constants {
    public static final int EXPECTED_INPUT_DATA_SIZE = 3;

    // Enumで抽象メソッドを定義 https://qiita.com/KeithYokoma/items/9681b130ea132cfad64d
    // PlusやMinusは一個一個がオブジェクト
    public static enum VALID_OPERATORS {
        Plus("+") {
            @Override
            public double apply(int operand1, int operand2) {
                return operand1 + operand2;
            }
        },
        Minus("-") {
            @Override
            public double apply(int operand1, int operand2) {
                return operand1 - operand2;
            }
        },
        Multiplication("*") {
            @Override
            public double apply(int operand1, int operand2) {
                return operand1 * operand2;
            }
        },
        Division("/") {
            @Override
            public double apply(int operand1, int operand2) {
                if(operand2 == 0) throw  new ArithmeticException("0では割れません");
                return operand1 / operand2;
            }
        };

        private String operator; // 文字列の+, -, *, ÷を保持

        private  VALID_OPERATORS(String operator) {
            this.operator = operator;
        }

        // 列挙子の内、文字列のみ返す
        public String getValue() {
            return this.operator;
        }

        // 抽象メソッド
        public abstract double  apply(int a, int  b);

        // 演算子と計算メソッドをセットにして返す。
        public static VALID_OPERATORS fromString(String operator) {
            VALID_OPERATORS match_operator_obj = VALID_OPERATORS.Plus; // 初期値設定

            for(VALID_OPERATORS op: VALID_OPERATORS.values()) {
                if(op.getValue().equals(operator)) {
                   match_operator_obj = op;
                   break;
                }
            }

            return  match_operator_obj;
        }
    }
}