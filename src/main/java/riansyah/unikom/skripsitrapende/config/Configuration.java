package riansyah.unikom.skripsitrapende.config;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import riansyah.unikom.skripsitrapende.guicontroller.DialogController;

@Import(DialogController.class)
@org.springframework.context.annotation.Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"riansyah.unikom.skripsitrapende.services", "riansyah.unikom.skripsitrapende.gui"})

public class Configuration {

    @Bean
    public DataSource dataSource(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("admin");
        dataSource.setURL("jdbc:mysql://localhost:3306/sitrapende_db");
        return dataSource;
    }
    
    public Properties properties(){
        
        return new Properties(){
            {
                setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
                setProperty("hibernate.show_sql", "true");
                setProperty("hibernate.hbm2ddl.auto", "update");
            }
        };
    }
    
    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource){
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setHibernateProperties(properties());
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setPackagesToScan("riansyah.unikom.skripsitrapende.models");
        return sessionFactoryBean;
    }
    
    @Bean
    public HibernateTransactionManager transactionManager (SessionFactory sessionFactory){
        return new HibernateTransactionManager(sessionFactory);
    }
    
    
}
