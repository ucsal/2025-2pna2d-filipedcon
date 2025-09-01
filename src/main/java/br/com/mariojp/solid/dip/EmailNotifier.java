package br.com.mariojp.solid.dip;

public class EmailNotifier {
    private final MailSender mailSender;

    public EmailNotifier() {
        if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
            this.mailSender = new NoopMailSender();
        } else {
            this.mailSender = new SmtpClient();
        }
    }

    public void welcome(User user) {
        mailSender.send(user.email(), "Bem-vindo", "Olá " + user.name());
    }
}
