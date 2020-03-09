package be.apti;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            SessionFactory factory = new Configuration().configure().buildSessionFactory();
            Session session = factory.openSession();

            try{
                CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
                CriteriaQuery<Lector> criteriaQuery = criteriaBuilder.createQuery(Lector.class);
                Root<Lector> root = criteriaQuery.from(Lector.class);
                CriteriaQuery<Lector> alles = criteriaQuery.select(root);
                TypedQuery<Lector> typedQuery = session.createQuery(alles);
                List<Lector> lectorList = typedQuery.getResultList();
                for(Lector lector : lectorList){
                    System.out.println(lector.toString());
                }

            }catch(Exception ex){
                System.err.println(ex.getMessage());
            }
        } catch(Exception ex){
            System.err.println(ex.getMessage());
        }


    }
}
