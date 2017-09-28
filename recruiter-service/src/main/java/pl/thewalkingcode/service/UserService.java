package pl.thewalkingcode.service;

import pl.thewalkingcode.model.User;
import pl.thewalkingcode.repository.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UserService {

    @Inject
    private UserRepository userRepository;

}
