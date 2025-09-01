import br.com.mariojp.solid.dip.*;

public class Main {
	public static void main(String[] args) {
		System.setProperty("DRY_RUN", "true"); // desejável não chamar SMTP
		var notifier = new EmailNotifier();
		// Estado inicial: vai lançar IllegalStateException (SMTP indisponível)
		notifier.welcome(new User("Ana", "ana@example.com"));
		System.out.println("Email enviado!");
	}
}

//DIP — Notificador (testes falham inicialmente)
//
//EmailNotifier instancia SmtpClient diretamente. SmtpClient lança erro se SMTP_AVAILABLE não for "true".
//O teste seta DRY_RUN=true e espera que não lance (no design DIP, você usará um remetente abstrato/Noop).
//Tarefa
//
//    Introduza uma abstração (MailSender) e respeite DRY_RUN=true para não usar SMTP real.
