
// Java Program to Illustrate App File
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
// Main class
public class App {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Create Configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);
 
        // Create Session Factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
 
        // Initialize Session Object
        Session session = sessionFactory.openSession();
 
        Song song1 = new Song();
 
        song1.setId(1);
        song1.setSongName("Broken Angel");
        song1.setArtist("Akon");
        
        song1.setId(2);
        song1.setSongName("Aise kyun");
        song1.setArtist("Rekha Bharatdwaj");
        
        song1.setId(3);
        song1.setSongName("kesariya");
        song1.setArtist("Arijit singh");
        
        song1.setId(4);
        song1.setSongName("Soch");
        song1.setArtist("Harrdy Sandhu");
        
        song1.setId(5);
        song1.setSongName("kho gaye");
        song1.setArtist("Taaruk Raina");
        
        
        session.beginTransaction();
 
        // Here we have used
        // save() method of JPA
        session.save(song1);
 
        session.getTransaction().commit();
    }
}
