package riansyah.unikom.skripsitrapende.services;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import riansyah.unikom.skripsitrapende.models.Keluarga;
import riansyah.unikom.skripsitrapende.models.Penduduk;

@Repository
@Transactional(readOnly = true)
public class ServiceKeluarga{
    
    private SessionFactory sessionFactory;
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    public Session getSessionFactory(){
        return sessionFactory.getCurrentSession();
    }
    
    public List<Keluarga> findByName(String nama){
       Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Keluarga.class);
       criteria.add(Restrictions.eq("nama", nama));
       return criteria.list();
    }
    
    public List<Keluarga> find(){
        return getSessionFactory().createCriteria(Keluarga.class).list();
    }
    
    @Transactional(readOnly = false)
    public void save(Keluarga keluarga) throws Exception{
        getSessionFactory().save(keluarga);
    }
        
    @Transactional(readOnly = false)
    public void update(Keluarga keluarga)throws Exception{
        getSessionFactory().update(keluarga);
    }
    
    @Transactional(readOnly = false)
    public void delete(Keluarga keluarga) throws Exception{
        getSessionFactory().delete(keluarga);
    }
}