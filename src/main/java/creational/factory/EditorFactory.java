package creational.factory;

public class EditorFactory {

    public static Editor getEditor(EditorType type){
        switch (type){
            case PHOTO:
                return new PhotoEditor();
            case VIDEO:
                return new VideoEditor();
            default:
                return null;
        }
    }
}
