import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.actionSystem.TypedActionHandler;
import com.intellij.openapi.project.Project;

/**
 * Created by makma_000 on 9/27/2015.
 */
public class InputHandler implements TypedActionHandler {
    @Override
    public void execute(Editor editor, char c, DataContext dataContext) {
        final Document document = editor.getDocument();

        Project project = editor.getProject();

        WriteCommandAction.runWriteCommandAction(project, () -> {
            document.insertString(0, "Typed\n");
        });
    }
}
