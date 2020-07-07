package com.blog_security.service.impl;

import com.blog_security.model.User;
import com.blog_security.model.UserRole1;
import com.blog_security.repository.UserRepository;
import com.blog_security.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    UserRoleRepository userRoleRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
           User user = userRepository.findAllByUserName(userName);
           if(user == null)
               throw new UsernameNotFoundException("User " + userName + " was not found in the database");

        List<UserRole1> roleList = userRoleRepository.findAllByUserId_UserId(user.getUserId());
        List<GrantedAuthority> grantList = new ArrayList<>();
        if (roleList != null) {
            for (UserRole1 role : roleList) {
                System.out.println(role.getRoleId().getRoleName());
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRoleId().getRoleName());
                grantList.add(grantedAuthority);
            }
        }
       UserDetails userDetails = (UserDetails) new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),grantList);
        return userDetails;
    }
}
