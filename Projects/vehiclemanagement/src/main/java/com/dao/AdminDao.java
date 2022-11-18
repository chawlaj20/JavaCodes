package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.entity.Admin;
import com.util.HibernateUtil;

public class AdminDao {
	
	 /**
     * Save Admin
     * @param admin
     */
    public void saveAdmin(Admin admin) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(admin);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Update Admin
     * @param admin
     */
    public void updateAdmin(Admin admin) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(admin);
            
            Admin admin2=session.get(Admin.class,1);
            admin2.setFirstName("jyoti");
            admin2.setEmail("jyoti@gmail.com");
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    /**
     * Delete Admin
     * @param id
     */
    public void deleteAdmin(int id) {

 

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

 

            // Delete a admin object
            Admin admin= session.get(Admin.class, id);
            if (admin!= null) {
                session.delete(admin);
                System.out.println("admin is deleted");
            }

 

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Get Admins By ID
     * @param id
     * @return
     */
 
    public Admin getAdmin(int id) {

    	 

        Transaction transaction = null;
        Admin admin = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an instructor object
            admin = session.get(Admin.class, id);
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
    
    /**
     * Get all Admins
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<Admin> getAllAdmin() {

 

        Transaction transaction = null;
        List<Admin> listOfAdmin = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an instructor object
            
            listOfAdmin = session.createQuery("from Admin").getResultList();
            
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfAdmin;
    }

}
