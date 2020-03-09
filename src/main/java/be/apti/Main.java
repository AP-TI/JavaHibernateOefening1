package be.apti;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            SessionFactory factory = new Configuration().configure().buildSessionFactory();
            Session session = factory.openSession();
            try{
                Scanner scanner = new Scanner(System.in);
                CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
                CriteriaQuery<Lector> criteriaQuery = criteriaBuilder.createQuery(Lector.class);
                Root<Lector> root = criteriaQuery.from(Lector.class);
                System.out.print("Geef lector naam: ");
                String lectorNaam = scanner.nextLine();
                System.out.println("Gekozen lector: " + lectorNaam);
                criteriaQuery.select(root);
                criteriaQuery.where(criteriaBuilder.equal(root.get("naam"), lectorNaam));
                TypedQuery<Lector> typedQuery = session.createQuery(criteriaQuery);
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
