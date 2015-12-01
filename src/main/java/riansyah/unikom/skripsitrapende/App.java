package riansyah.unikom.skripsitrapende;

import riansyah.unikom.skripsitrapende.config.Configuration;
import riansyah.unikom.skripsitrapende.gui.FormLogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext springContainer = new AnnotationConfigApplicationContext(Configuration.class);
        FormLogin menuUtama = springContainer.getBean(FormLogin.class);
        menuUtama.setVisible(true);
    }
}
