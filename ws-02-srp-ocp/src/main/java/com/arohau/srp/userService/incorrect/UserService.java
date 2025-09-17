package com.arohau.srp.userService.incorrect;

public interface UserService {
    // user managing functionality
    void create(String[] args);
    void read(String[] args);
    void update(String[] args);
    void delete(String[] args);

    // some supportive functionality
    void validatePasswordComplexity();
    void saveToDatabase();
    void getConnectionToDatabase();
}
