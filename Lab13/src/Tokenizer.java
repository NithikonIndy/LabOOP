public interface Tokenizer {
    boolean hasNextToken();

    String peek();

    String consume();

    boolean peek(String s);

    void cousume(String s)throws Exception;
}
