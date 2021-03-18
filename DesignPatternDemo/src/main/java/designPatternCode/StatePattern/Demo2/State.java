package designPatternCode.StatePattern.Demo2;

public interface State {
    public void start(Context context);
    public void close(Context context);
}
