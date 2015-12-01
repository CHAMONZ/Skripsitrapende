package riansyah.unikom.skripsitrapende.guicontroller;

import org.springframework.context.ApplicationContext;
import riansyah.unikom.skripsitrapende.gui.*;

public class MainController {
    
    private ApplicationContext springContext;
    
    public void ShowPanelPenduduk(){
        PanelPenduduk panelPenduduk = springContext.getBean(PanelPenduduk.class);
        panelPenduduk.setVisible(true);
    }
}