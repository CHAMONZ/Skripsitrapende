package riansyah.unikom.skripsitrapende.guicontroller;

import org.springframework.context.ApplicationContext;
import riansyah.unikom.skripsitrapende.gui.*;

public class PanelController {
    
    private ApplicationContext springContext;
    
    public void ShowDialogPendudukAdd(){
        DialogPendudukAdd dialogPendudukAdd = springContext.getBean(DialogPendudukAdd.class);
        dialogPendudukAdd.setVisible(true);
    }
}
