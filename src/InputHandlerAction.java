import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.editor.actionSystem.EditorActionManager;
import com.intellij.openapi.editor.actionSystem.TypedAction;

/**
 * Created by makma_000 on 9/27/2015.
 */
public class InputHandlerAction extends AnAction {
    static {
        final EditorActionManager actionManager = EditorActionManager.getInstance();
        final TypedAction typedAction = actionManager.getTypedAction();
        typedAction.setupHandler(new InputHandler());
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {

    }
}
