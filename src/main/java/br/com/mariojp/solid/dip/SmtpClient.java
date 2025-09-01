package br.com.mariojp.solid.dip;

public class SmtpClient implements MailSender {
    public void send(String to, String subject, String body){
        if(!"true".equalsIgnoreCase(System.getProperty("SMTP_AVAILABLE"))) {
            throw new IllegalStateException("SMTP indisponível");
        }
        if(to == null || !to.contains("@")) throw new IllegalArgumentException("email inválido");
        // envia ...
    }
}
