package evidencijaBE.service;

import java.util.Optional;

import evidencijaBE.config.SecurityContextUtil;
import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(SecurityContextUtil.getUserName());
    }



}