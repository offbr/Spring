package pack;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;

@Controller
public class EmailSender {
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmail(Email email) throws Exception{
		MimeMessage msg = mailSender.createMimeMessage(); //메일 발송 기능
		msg.setSubject(email.getSubject()); //메일제목
		msg.setText(email.getContent()); //메일내용
		msg.setRecipient(RecipientType.TO, new InternetAddress(email.getReceiver())); //대상, 수신자
		mailSender.send(msg);
	}
	
}
