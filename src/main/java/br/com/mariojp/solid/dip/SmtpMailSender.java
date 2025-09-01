package br.com.mariojp.solid.dip;

public class SmtpMailSender {

    private final SmtpClient smtp;
    public SmtpMailSender(SmtpClient smtpClient) {
        this.smtp = smtpClient;
    }
    public void send(String to, String subject, String body) {
        smtp.send(to, subject, body);
    }
}
