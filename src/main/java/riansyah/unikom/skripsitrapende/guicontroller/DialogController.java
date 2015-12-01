package riansyah.unikom.skripsitrapende.guicontroller;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import riansyah.unikom.skripsitrapende.gui.*;

@Configurable       
public class DialogController {
    
    @Bean
    public DialogPendudukAdd dialogPendudukAdd(){
        return new DialogPendudukAdd(null, true);
    }
}
