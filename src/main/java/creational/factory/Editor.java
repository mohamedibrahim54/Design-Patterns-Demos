package creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Editor {

    protected List<String> tools = new ArrayList<>();

    public Editor() {
        createTools();
    }

    public List<String> getTools() {
        return tools;
    }

    public abstract void createTools();

}
