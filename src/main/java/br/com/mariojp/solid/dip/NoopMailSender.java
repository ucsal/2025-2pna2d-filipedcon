package br.com.mariojp.solid.dip;


public class NoopMailSender implements MailSender {
	public void send(String to, String subject, String body) {
	System.out.println("[DRY_RUN] Email simulado para " + to);
	}
}
