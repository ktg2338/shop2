package com.jpa.shop2.service;

import com.jpa.shop2.entity.Member;
import com.jpa.shop2.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class MemberDetailService implements UserDetailsService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Member findMember = memberRepository.findByEmail(email);
        if (findMember == null)
            throw new UsernameNotFoundException(email);

        return User.builder()
                .username(findMember.getEmail())
                .password(findMember.getPassword())
                .roles(findMember.getRole().toString())
                .build();
    }
}
