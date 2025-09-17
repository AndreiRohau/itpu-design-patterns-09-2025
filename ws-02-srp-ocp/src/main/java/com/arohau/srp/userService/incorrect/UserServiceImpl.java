package com.arohau.srp.userService.incorrect;

public class UserServiceImpl implements UserService {

    private static UserService userService = null;

    private PasswordComplexityValidator passwordComplexityValidator;

    private UserServiceImpl(PasswordComplexityValidator passwordComplexityValidator) {
        this.passwordComplexityValidator = passwordComplexityValidator;
    }

    public static UserService getUserServiceInstance() {
        synchronized (userService) {
            if (userService == null) {
                userService = new UserServiceImpl(new PasswordComplexityValidatorImpl());
            }
        }
        return userService;
    }

    public void create(String[] args) {
//        param not null check
        // password complexity validation
        // passwordComplexityValidator.validate(password)
        // save user
        saveToDatabase();
    }
    public void read(String[] args) {
        // get user
    }
    public void update(String[] args) {
        // password complexity validation
        // mutate user
    }
    public void delete(String[] args) {
        // remove user
    }

    // this part shall be moved out of this class, since this class should not be responsible for such features

    // non-complient with SRP, since UserService is responsible for User Data lifecycle
    public void validatePasswordComplexity() {
        // validate password complexity
        // calculation...
    }
    
    // non-complient with SRP, since UserService is responsible for User Data lifecycle
    public void saveToDatabase() {
        getConnectionToDatabase();
        // validate password complexity
    }

    // non-complient with SRP, since UserService is responsible for User Data lifecycle
    public void getConnectionToDatabase() {
    }
}
