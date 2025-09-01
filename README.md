# DIP — Notificador (testes falham inicialmente)

`EmailNotifier` instancia `SmtpClient` diretamente. `SmtpClient` lança erro se `SMTP_AVAILABLE` não for `"true"`.  
O teste seta `DRY_RUN=true` e espera que **não lance** (no design DIP, você usará um remetente abstrato/Noop).  

## Tarefa
- Introduza uma abstração (`MailSender`) e respeite `DRY_RUN=true` para não usar SMTP real.

## Rodar
```bash
mvn -q test
```
Professor, aqui também ocorreu o erro de colocar a "feedback" como default e eu não notar, os meus commits foram pra ela
