import java.util.Map;

public class IntLit implements Expr{
    private int val;
    public IntLit(int val){
        this.val=val;
    }
    @Override
    public int eval(Map<String, Integer> bindings) {
        return val;
    }

    @Override
    public void prettyPrint(StringBuilder s) {
        s.append(val);
    }
}
