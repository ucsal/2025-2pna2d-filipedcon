package br.com.mariojp.solid.dip;

public interface MailSender {

void send(String to, String subject, String body);
}
