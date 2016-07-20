package io.summerx.sso.service.impl;

import io.summerx.sso.authentication.service.DefaultUserService;
import io.summerx.sso.authentication.service.UserService;
import io.summerx.sso.authentication.userdetails.UserDetails;

/**
 * <p>
 * 请在这里添加类说明.
 * </p>
 *
 * @author summerx
 * @Date 2016-07-20 2:10 PM
 */
public class SSOUserServiceImpl extends DefaultUserService implements UserService {

    /**
     * 扩展此方法以满足更多需求
     */
    @Override
    public UserDetails loadUserByUsername(String username) {
        return super.loadUserByUsername(username);

    }
}
