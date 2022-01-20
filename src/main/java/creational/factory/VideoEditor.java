package creational.factory;

public class VideoEditor extends Editor{
    @Override
    public void createTools() {
        tools.add("trim");
        tools.add("add music");
        tools.add("change play speed");
    }
}
