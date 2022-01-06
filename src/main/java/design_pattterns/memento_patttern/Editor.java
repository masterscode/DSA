package design_pattterns.memento_patttern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Editor {
    private String content;
    private String title;

    private final History editorHistory = new History();

    public void save(String title, String content){
        this.content = content;
        this.title = title;
        var newEditorState = new EditorState(title, content);

    }
}
