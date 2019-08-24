package cn.aia.test;

import cn.aia.dao.UserDao;
import cn.aia.domain.User;
import org.junit.Test;

/**
 * Created by admin on 2019/8/24.
 */
public class UserDaoTest {

    @Test
    public void testLogin(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");

        UserDao dao = new UserDao();
        User u = dao.login(user);
        System.out.print(u);
    }
}
