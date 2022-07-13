package design.strategy;

public class Encoder {
    private EncodingStrategy encodingStrategy;

    public String getMsg(String msg) {
        return this.encodingStrategy.encode(msg);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}
