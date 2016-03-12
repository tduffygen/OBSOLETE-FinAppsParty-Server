/**
 * 
 */
package com.realex.clubpay.server;

/**
 * @author Thomas
 *
 */

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Main {

	@Autowired
	PayService payService;
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }
    
    @RequestMapping("/pay")
    public String pay(@RequestParam("timestamp") String timestamp, 
    		@RequestParam("phoneId") String phoneIdentifier, 
    		@RequestParam("moteId") String moteId) {
    	System.out.println("At pay endpoint.");
    	System.out.println("Timestamp: " + timestamp);
    	System.out.println("PhoneID: " + phoneIdentifier);
    	System.out.println("MoteID: " + moteId);
    	
    	if (payService.detailsStored(phoneIdentifier)) {
    	}
        return "Hello";
    }
    

}