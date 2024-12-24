import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class GraphicsMenuListener implements MenuListener {
    private MainFrame mainFrame;

    public GraphicsMenuListener(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void menuSelected(MenuEvent e) {
        // Доступ через ссылку на MainFrame
        mainFrame.getShowAxisMenuItem().setEnabled(mainFrame.isFileLoaded());
        mainFrame.getShowMarkersMenuItem().setEnabled(mainFrame.isFileLoaded());
    }

    @Override
    public void menuDeselected(MenuEvent e) {}

    @Override
    public void menuCanceled(MenuEvent e) {}
}
