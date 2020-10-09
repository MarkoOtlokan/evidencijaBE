package evidencijaBE.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import evidencijaBE.model.EvUser;
import evidencijaBE.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class DefaultUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        EvUser user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {

            List<GrantedAuthority> grantedAuthorities = user.getUserAuthorities().stream()
                    .map(authority -> new SimpleGrantedAuthority(authority.getAuthority().getNaziv()))
                    .collect(Collectors.toList());

            @SuppressWarnings("deprecation")
            UserDetails userDetail = User.withDefaultPasswordEncoder()
                    .username(user.getUsername())
                    .password(user.getPassword())
                    .authorities(grantedAuthorities)
                    .build();

            return userDetail;
        }
    }

}
