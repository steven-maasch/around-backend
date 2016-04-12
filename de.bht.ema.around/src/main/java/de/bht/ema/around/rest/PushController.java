package de.bht.ema.around.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.bht.ema.around.push.PushMessage;
import de.bht.ema.around.push.PushMessageGenerator;
import de.bht.ema.around.push.SnsMobilePushService;

@RestController
@RequestMapping("/push_it")
public class PushController {

	@Autowired
	private SnsMobilePushService pushService;
	
	@RequestMapping(value = "/android", method = RequestMethod.GET)
	public void pushItToAndroid() {
		final PushMessage message = PushMessageGenerator.createAndroidMessage("xD", "Message");
		pushService.sendAppNotification(message);
	}
	
}
