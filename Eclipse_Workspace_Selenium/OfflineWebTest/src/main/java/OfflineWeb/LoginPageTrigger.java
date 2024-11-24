package OfflineWeb;

public class LoginPageTrigger {
public static void main(String[] args) throws Exception {
	LogInPageTestCase log = new LogInPageTestCase();
	log.CheckingTitle();
	log.CheckingUrl();
	log.CheckingEmail();
	log.CheckingPassword();
	log.checkLoginButton();
}
}
