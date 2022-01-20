package creational.factory;

public class PhotoEditor extends Editor{
    @Override
    public void createTools() {
        tools.add("crop");
        tools.add("resize");
        tools.add("filter");
    }
}
