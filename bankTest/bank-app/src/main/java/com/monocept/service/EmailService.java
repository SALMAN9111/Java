package com.monocept.service;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

  @Autowired
  private JavaMailSender mailSender;

  public void sendMail(String email, long customerId,String password) {

	  System.out.println("Inside send  mail");
	  System.out.println("email-"+email);
	  System.out.println("account number "+customerId);
	  
    MimeMessage message = mailSender.createMimeMessage();
    MimeMessageHelper helper = new MimeMessageHelper(message);

    try {
      helper.setSubject("Congratulations, Your Bank Account has been created successfully");
      helper.setTo(email);

      boolean html = true;
      helper.setText(
          "<h2>Welcome to MBI (Monocept Bank of India), Your Account Number is "+customerId+" and Password is "+password+" </h2>",
          html);
      mailSender.send(message);

    } catch (Exception e) {
      e.printStackTrace();
    }

//    message.setTo(to);
//    message.setSubject("Congratulations, Your Bank Account has been created successfully");
//    message.setText("<h2>Please visit Bank website to Re-set your Password</h2>");
//    message.setText("");
//    
//    try {
//      mailSender.send(message); // This line produces the exception
//    } catch (Exception e) {
//      e.printStackTrace();
//      System.out.println("Can't send message");
//    }
  }
}