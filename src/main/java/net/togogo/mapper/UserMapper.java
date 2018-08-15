package net.togogo.mapper;

import net.togogo.bean.User;
import org.springframework.stereotype.Repository;

/**
 * @author lingeros
 * @date 18-8-15
 **/
@Repository
public interface UserMapper {

    User getUser(Integer user_id);
}
