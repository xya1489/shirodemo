package com.jd.xya.shirodemo.security;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

/**
 * Created by Administrator on 2017/5/31 0031.
 */
public class MyShiroRealm  extends AuthorizingRealm {


    /**
     * 权限认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 身份认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String algorithmName = "md5";

        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        //取得用户名
        String username = (String) usernamePasswordToken.getPrincipal();

        //用户名做盐
        String userNameSalt = username;
        int hashIterations = 2 ; //加密次数

        SimpleHash hash = new SimpleHash(algorithmName, usernamePasswordToken.getPassword(), userNameSalt, hashIterations);
        //加密后密码
        String encodedPassword = hash.toHex();
        SimpleAuthenticationInfo simpleAuthenticationInfo =  new SimpleAuthenticationInfo(username,encodedPassword,getName());
        return simpleAuthenticationInfo;
    }
}
