package ar.com.conexia.modelo;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
 
public class SchedulerTask{
	
	private MailSender mailSender;
	
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	public void sendMail(String from, String to, String subject, String msg) {
		 
		SimpleMailMessage message = new SimpleMailMessage();
 
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(msg);
		
		mailSender.send(message);
	}	

	public void printMessage() {
		
		System.out.println("Hola me dispara un Cron....");
	
		try{
		
			this.sendMail("vademecumconexia@gmail.com", "edumarvega@hotmail.com", 
				"Error - Vademecum Conexia", "Haciendo pruebas desde vademecum-conexia, http://192.168.150.83:8080/vademecum/home.do");
				
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}