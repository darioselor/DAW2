package fpmislata.examen.domain.repository;

import java.util.Optional;

import fpmislata.examen.domain.model.User;

public interface UserRepository {
    Optional<User> getUserByAddress(String address);
}
