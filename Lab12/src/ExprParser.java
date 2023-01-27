import java.util.HashMap;
import java.util.Map;

public class ExprParser {
    private ExprTokenizer tkz;
    private int result = 0;
    private BinaryArithExpr cal;
    private Map<String,Integer> str = new HashMap();
    public ExprParser(String src){
        this.tkz = new ExprTokenizer(src);
    }

    Expr parseE() throws SyntaxError {
        Expr val = parseT();
        while(tkz.peek("+")||tkz.peek("-")){
            String op = tkz.consume();
            Expr val2 = parseT();
            if(op.equals("+")){
                cal = new BinaryArithExpr(val,"+",val2);
                val = cal;
            }else if(op.equals("-")){
                cal = new BinaryArithExpr(val,"-",val2);
                val = cal;
            }
            try {
                result = cal.eval(str);
            } catch (EvalError e) {
                throw new RuntimeException(e);
            }
        }
        return val;
    }

    //T -> T * F|T / F|T % F|F
    Expr parseT() throws SyntaxError {
        Expr val = parseF();
        while(tkz.peek("*") || tkz.peek("/")||tkz.peek("%")){
            String op = tkz.consume();
            Expr val2 = parseF();
            if(op.equals("*")){
                cal = new BinaryArithExpr(val,"*",val2);
                val = cal;
            }else if(op.equals("/")){
                if(val2 != null){
                    cal = new BinaryArithExpr(val,"/",val2);
                    val = cal;
                }else{
                    throw new SyntaxError();
                }
            }else if(op.equals("%")){
                if(val2 != null){
                    cal = new BinaryArithExpr(val,"%",val2);
                    val = cal;
                }else{
                    throw new SyntaxError();
                }
            }
            try {
                result = cal.eval(str);
            } catch (EvalError e) {
                throw new RuntimeException(e);
            }
        }
        return val;
    }

    // F -> n | (E)
    Expr parseF() throws SyntaxError {
        try{
            IsNumber(tkz.peek());
            IntLit val2 = new IntLit(Integer.parseInt(tkz.consume()));
            return val2;
        }catch (NumberFormatException s){
            tkz.cousume("(");
            Expr val = parseE();
            tkz.cousume(")");
            return val;
        }
    }

    boolean IsNumber(String s) throws NumberFormatException{
        Integer.parseInt(s);
        return true;
    }

    public Expr  getExr() throws SyntaxError {
        return parseE();
    }
    public int Evaluate() throws SyntaxError {
        try {
            return parseE().eval(str);
        } catch (EvalError e) {
            throw new RuntimeException(e);
        }
    }
}
