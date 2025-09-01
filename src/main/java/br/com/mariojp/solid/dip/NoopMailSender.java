package br.com.mariojp.solid.dip;


public class NoopMailSender implements MailSender {
	public void send(String to, String subject, String body) {
    }
}
