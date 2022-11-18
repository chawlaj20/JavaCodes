package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Admin;
import com.entity.Admindetails;
import com.util.HibernateUtil;


public class AdminDetailsDao {
	
	public void saveAdmindetails(Admindetails admindetails) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(admindetails);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

	public void updateAdmindetails(Admindetails admindetails) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(admindetails);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
	
	 public Admindetails getAdmindetails(int id) {

    	 

	        Transaction transaction = null;
	        Admindetails admin = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an instructor object
	            admin = session.get(Admindetails.class, id);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return admin;
	    }
	    
}
