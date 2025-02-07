package fpmislata.examen.domain.service.impl;

import java.util.Optional;

import fpmislata.examen.common.annotation.DomainService;
import fpmislata.examen.domain.model.User;
import fpmislata.examen.domain.repository.UserRepository;
import fpmislata.examen.domain.service.UserService;
import lombok.RequiredArgsConstructor;

@DomainService
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Optional<User> getUserByAddress(String address) {
        return userRepository.getUserByAddress(address);
    }

}
