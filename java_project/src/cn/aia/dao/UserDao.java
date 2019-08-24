package cn.aia.dao;

import cn.aia.domain.User;
import cn.aia.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 操作数据库中User表的类
 */

public class UserDao {
    //声明JDBCTemplete对象共用
    private JdbcTemplate templete = new JdbcTemplate(JDBCUtils.getDataSource());

    public User login(User loginUser){
        String sql = "select * from user where username = ? and password = ?";
        User user = templete.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),
                loginUser.getUsername(),loginUser.getPassword());

        return  user;
    }
}
