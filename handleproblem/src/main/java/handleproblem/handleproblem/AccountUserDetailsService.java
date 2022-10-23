package handleproblem.handleproblem;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        /**
         * CODE TO SEARCH USER
         */

        if( 1>0 )throw new UsernameNotFoundException("Cant find user");

        // Never arrive here
        return User
                .builder()
                .username("username")
                .password("root")
                .build();
    }
}
