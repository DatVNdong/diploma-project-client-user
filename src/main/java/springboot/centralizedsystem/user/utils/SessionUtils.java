package springboot.centralizedsystem.user.utils;

import javax.servlet.http.HttpSession;

import springboot.centralizedsystem.user.domains.User;
import springboot.centralizedsystem.user.resources.Keys;

public class SessionUtils {

    public static User getAdmin(HttpSession session) throws NullPointerException {
        return (User) session.getAttribute(Keys.USER);
    }
}
