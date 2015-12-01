package riansyah.unikom.skripsitrapende;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import riansyah.unikom.skripsitrapende.config.Configuration;
import riansyah.unikom.skripsitrapende.gui.FormLogin;

public class App {
    public static void main(String[] args) {
        ApplicationContext springContainer = new AnnotationConfigApplicationContext(Configuration.class);
        FormLogin menuUtama = springContainer.getBean(FormLogin.class);
        menuUtama.setVisible(true);
    }
}
