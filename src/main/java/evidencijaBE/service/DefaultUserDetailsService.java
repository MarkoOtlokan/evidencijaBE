package evidencijaBE.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;


import evidencijaBE.model.KorisnikEntity;
import evidencijaBE.repository.KorisnikRepository;
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
    private KorisnikRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        KorisnikEntity user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            //TODO
            //List<GrantedAuthority> grantedAuthorities = user.getUserAuthorities().stream()
              //      .map(authority -> new SimpleGrantedAuthority(authority.getAuthority().getNaziv()))
             //       .collect(Collectors.toList());

            @SuppressWarnings("deprecation")
            UserDetails userDetail = User.withDefaultPasswordEncoder()
                    .username(user.getKorisnickoIme())
                    .password(user.getSifra())
                    .authorities("*")//TODO
                    .build();

            return userDetail;
        }
    }

}
