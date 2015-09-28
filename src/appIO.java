import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.editor.actionSystem.EditorActionManager;
import com.intellij.openapi.editor.actionSystem.TypedAction;
import org.apache.sanselan.util.Debug;
import org.jetbrains.annotations.NotNull;

/**
 * Created by makma_000 on 9/24/2015.
 */
public class appIO implements ApplicationComponent {


    public appIO() {

        Debug.debug("App On");

        BackgroundAction b1 = new BackgroundAction("TIME 1");

        b1.start();

        BackgroundAction b2 = new BackgroundAction("Time 2");

        b2.start();

        // Start InputHandlerAction immediately
//        final EditorActionManager actionManager = EditorActionManager.getInstance();
//        final TypedAction typedAction = actionManager.getTypedAction();
//        typedAction.setupHandler(new InputHandler());

    }

    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @NotNull
    public String getComponentName() {
        return "appIO";
    }
}
