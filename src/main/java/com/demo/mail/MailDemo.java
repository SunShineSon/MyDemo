package com.demo.mail;

import java.util.Arrays;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;



import jodd.mail.Email;
import jodd.mail.SendMailSession;
import jodd.mail.SmtpServer;


public class MailDemo {
	
    private static Logger log = Logger.getLogger(MailDemo.class);
    private static ResourceBundle mailBundle = ResourceBundle.getBundle("bind");

	public static void main(String[] args) {
		MailDemo demo = new MailDemo();
		try {
			demo.callBack("635447921@qq.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param mail 收件人邮件
	 * @throws Exception
	 */
    public void callBack(String mail) throws Exception {
        // 主题
        String subject = null;
        // 邮箱内容
        StringBuffer content = new StringBuffer();

        StringBuffer EmailContent = new StringBuffer();

        EmailContent.append("<html><body>尊敬的用户：<br/>&nbsp;&nbsp;&nbsp;您好，感谢您使用变色龙平台，请您在24小时内点击<a href=\"");
            subject = "变色龙账号激活";
            EmailContent.append(content.toString());
            EmailContent.append("\">激活账户</a>以激使用你的账户，");
            EmailContent.append("如有问题请致电我们的客服.<br/>");
            EmailContent.append("&nbsp;&nbsp;&nbsp;您的账号信息：" + "<br/>");
        
        EmailContent.append("联系电话:" + mailBundle.getString("mail.tel"));
        EmailContent.append("</body></html>");
        log.info(EmailContent.toString());
        notice(mail, subject, EmailContent.toString());
    }
    
    public void notice(String toUser, String subject, String content) throws Exception {
        Email email = Email.create().from(mailBundle.getString("mail.fromAddress")).to(toUser).subject(subject).addHtml(content);

        SmtpServer smtpServer = new SmtpServer(mailBundle.getString("mail.hostName"));
        smtpServer.authenticateWith(mailBundle.getString("mail.username"), mailBundle.getString("mail.password"));
        SendMailSession session = smtpServer.createSession();
        session.open();

        if (log.isDebugEnabled()) {
            log.info("eamil from: " + email.getFrom() + " ------> to: " + Arrays.toString(email.getTo()));
        }
        try {
            session.sendMail(email);
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            session.close();
        }

    }
}
