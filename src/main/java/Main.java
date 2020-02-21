import entities.User;
import orm.Connector;
import orm.EntityManager;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {

        String username = "root";
        String password = "658473";

        Connector.createConnection(username,password, "orm_db");
        EntityManager<User> entityManger = new EntityManager<>(Connector.getConnection());

//      User user = new User("Pesho","658473",25,new Date());
//      User user2 = new User("Tosho","1234",27,new Date());
//        User user2= new User("Stamat","12345",22, new Date());
//      entityManger.persist(user2);
//
//        User user = entityManger.findFirst(User.class," username = 'Stamat'");
//        entityManger.delete(user);
//
//        System.out.println("User is deleted");
//
//        List<User> users = (List<User>) entityManger.find(User.class, " age > 23 ");
//
//        for (User userr : users) {
//            System.out.println(userr.getUsername());
//        }
//
//        System.out.println("--------");
//
//        List<User> allusers = (List<User>) entityManger.find(User.class);
//        for (User userr : allusers) {
//            System.out.println(userr.getUsername());
//        }
    }
}