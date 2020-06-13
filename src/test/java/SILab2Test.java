import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyStatementTest(){
        RuntimeException ex;

        List<String> userList = new ArrayList<String>();

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, userList));
        assertTrue(ex.getMessage().contains("The user argument is not initialized!"));

        User user = new User(null, null, null);
        User finalUser1 = user;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(finalUser1, userList));
        assertTrue(ex.getMessage().contains("User already exists!"));

        user = new User(null, null, null);
        User finalUser = user;
        assertTrue(user.getEmail() == null);


        user = new User(null, null, "marija$vezba");
        boolean atChar = false, dotChar = false;
        for (int i=0;i<user.getEmail().length();i++){
            if (user.getEmail().charAt(i)=='@')
                atChar = true;
            if (atChar && user.getEmail().charAt(i)=='.'){
                dotChar = true;
            }
        }
        assertTrue(!atChar && !dotChar);

        user = new User(null, null, "marija@vezba.a");
        atChar = false;
        dotChar = false;
        for (int i=0;i<user.getEmail().length();i++){
            if (user.getEmail().charAt(i)=='@')
                atChar = true;
            if (atChar && user.getEmail().charAt(i)=='.'){
                dotChar = true;
            }
        }
        assertTrue(atChar && dotChar);
    }
    @Test
    void everyBranchTest(){
        RuntimeException ex;

        List<String> userList = new ArrayList<String>();

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, userList));
        assertTrue(ex.getMessage().contains("The user argument is not initialized!"));

        User user = new User(null, null, null);
        User finalUser1 = user;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(finalUser1, userList));
        assertTrue(ex.getMessage().contains("User already exists!"));

        user = new User(null, null, null);
        User finalUser = user;
        assertTrue(user.getEmail() == null);


        user = new User(null, null, "marija*vezba");
        boolean atChar = false, dotChar = false;
        for (int i=0;i<user.getEmail().length();i++){
            if (user.getEmail().charAt(i)=='@')
                atChar = true;
            if (atChar && user.getEmail().charAt(i)=='.'){
                dotChar = true;
            }
        }
        assertTrue(!atChar && !dotChar);

        user = new User(null, null, "mar@s.ija");
        atChar = false;
        dotChar = false;
        for (int i=0;i<user.getEmail().length();i++){
            if (user.getEmail().charAt(i)=='@')
                atChar = true;
            if (atChar && user.getEmail().charAt(i)=='.'){
                dotChar = true;
            }
        }
        assertTrue(atChar && dotChar);
    }
}