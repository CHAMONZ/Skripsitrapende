package riansyah.unikom.skripsitrapende.services;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import riansyah.unikom.skripsitrapende.models.Penduduk;

@Repository
@Transactional(readOnly = true)
public class ServicePenduduk {
    
    private SessionFactory sessionFactory;
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public Session getSessionFactory(){
        return sessionFactory.getCurrentSession();
    }
    
    public List<Penduduk> findByName(String nama){
       Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Penduduk.class);
       criteria.add(Restrictions.eq("nama", nama));
       return criteria.list();
    }
    
    public List<Penduduk> find(){
        return getSessionFactory().createCriteria(Penduduk.class).list();
    }
    
    @Transactional(readOnly = false)
    public void save(Penduduk penduduk) throws Exception{
        getSessionFactory().save(penduduk);
    }
        
    @Transactional(readOnly = false)
    public void update(Penduduk penduduk)throws Exception{
        getSessionFactory().update(penduduk);
    }
    
    @Transactional(readOnly = false)
    public void delete(Penduduk penduduk) throws Exception{
        getSessionFactory().delete(penduduk);
    }
}
