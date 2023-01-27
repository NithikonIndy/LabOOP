import java.util.Map;

public class Variable implements Expr {
    private String name;
    public Variable (String name){
        this.name=name;
    }
    @Override
    public int eval(Map<String, Integer> bindings) throws EvalError {
        if(bindings.containsKey(name)){
            return bindings.get(name);
        }
        throw new EvalError ("undifined variable"+name);
    }

    @Override
    public void prettyPrint(StringBuilder s) {
        s.append(name);
    }
}
