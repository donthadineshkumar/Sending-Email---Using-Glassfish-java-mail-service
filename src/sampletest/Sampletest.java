
package sampletest;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;

public class Sampletest {

    public static void main(String[] args) {
//        generateHash("Password1");
//        generateHash("Password2");
//        generateHash("Password3");
        
        TestmailController mail = new TestmailController();
        mail.sendMsg("donthadineshkumar@gmail.com", "TestMail", "I am using javamail session of glassfish");
        
         
    }
//    public static void generateHash(String password){
//        String  output = 
//                Hashing.sha256().hashString(password, Charsets.UTF_8).toString();
//        System.out.println(Hashing.md5().hashString(password, Charsets.UTF_8));
//    
}
