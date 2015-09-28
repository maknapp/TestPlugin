import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;


/**
 * Created by makma_000 on 9/27/2015.
 */
public class SampleToolWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {

        SampleToolWindow sampleToolWindow = new SampleToolWindow();


        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(sampleToolWindow.getPanel(), "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
