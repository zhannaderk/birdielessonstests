package co.inventorsoft.birdietests.utils;

import org.testng.annotations.BeforeClass;

public class AuthenticatedBaseTest extends DriverActions {

    protected LoginData proCredentials() {
        return new LoginData("salamandra2043@gmail.com", "12345");
    }

    @BeforeClass
    public void login() {
        LoginData credentials = proCredentials();
        generalactions.login(credentials.email, credentials.password);
    }

    public class LoginData {
        private String email;
        private String password;

        public LoginData(String email, String password) {
            this.email = email;
            this.password = password;
        }
    }


}