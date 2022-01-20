package creational.factory;

public class FactoryDemo {
    public static void main(String[] args){
        Editor editor = EditorFactory.getEditor(EditorType.PHOTO);
        System.out.println(editor.getTools());

        editor = EditorFactory.getEditor(EditorType.VIDEO);
        System.out.println(editor.getTools());
    }
}
