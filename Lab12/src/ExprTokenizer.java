import java.util.NoSuchElementException;

public class ExprTokenizer implements Tokenizer{
    private String src;
    private String next;
    private int pos;

    public ExprTokenizer(String src){
        this.src=src;
        pos=0;
        computeNext();

    }
    @Override
    public boolean hasNextToken() {
        return next !=null;
    }

    @Override
    public String peek() {
        if (!hasNextToken()) {
            throw  new NoSuchElementException("no more tokens");
        }
        return next;

    }

    @Override
    public String consume() {
        if (!hasNextToken()) {
            throw  new NoSuchElementException("no more tokens");
        }
        String result = next;
        computeNext();
        return result;
    }

    private void computeNext() {
        StringBuilder s = new StringBuilder();
        while(pos<src.length() && isSpace(src.charAt(pos))) pos++;
        if(pos<src.length()){
            char c = src.charAt(pos);
            if(Character.isDigit(c)){
                s.append(c);
                for(pos++;pos<src.length() && Character.isDigit(src.charAt(pos));pos++){
                    s.append(src.charAt(pos));
                }
            }else if(isCharacter(c)){
                System.out.println("SyntaxError");
            }else if(c=='+'||c=='-'||c=='('||c==')'||c=='*'||c=='/'||c=='%'){
                s.append(c);pos++;
            }else{
                System.out.println("SyntaxError");
            }
        }
        next = s.toString();
    }
    private boolean isSpace(char c){
        if(c == ' '){
            return true;
        }
        return false;
    }

    private boolean isCharacter(char c){
        if((int) c <= 65 && (int) c >= 122){
            return true;
        }
        return false;
    }

    public boolean peek(String s){
        return peek().equals(s);
    }

    public void cousume(String s)throws SyntaxError{
        if(peek(s)){
            consume();
        }else {
            throw new RuntimeException(s+" expected");
        }
    }


}
