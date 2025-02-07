package fpmislata.examen.domain.service;

import java.util.Optional;

import fpmislata.examen.domain.model.User;

public interface UserService {
    Optional<User> getUserByAddress(String address);

}
