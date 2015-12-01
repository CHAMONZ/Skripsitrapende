package riansyah.unikom.skripsitrapende.guicontroller;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import riansyah.unikom.skripsitrapende.gui.DialogPendudukAdd;
import riansyah.unikom.skripsitrapende.services.ServiceKeluarga;
import riansyah.unikom.skripsitrapende.services.ServicePenduduk;

@Configurable
public class DialogController {

    @Bean
    public DialogPendudukAdd dialogPendudukAdd(ServiceKeluarga keluarge, ServicePenduduk penduduk) {
        return new DialogPendudukAdd(null, true, penduduk, keluarge);
    }
}
