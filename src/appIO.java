import com.intellij.openapi.components.ApplicationComponent;
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
