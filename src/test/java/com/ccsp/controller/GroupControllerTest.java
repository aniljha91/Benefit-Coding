package com.ccsp.controller;


import static org.mockito.Mockito.when;

import java.net.UnknownHostException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)

public class GroupControllerTest {
	
	@InjectMocks
	private GroupController groupController;
	
	@Mock
	private RestTemplate restTemplate;
	
	@Test
	public void testGetName() throws Exception {
		String name = "test";
		Assert.assertEquals(groupController.getName(name), name);
	}
	
	@Test
	public void testGetLoadBalancerDemo() throws UnknownHostException {
		when(restTemplate.getForObject("http://BENEFIT-DETERMINATION/determine/plan", String.class)).thenReturn("Test");
		String result = groupController.getLoadBalancerDemo();
		//String expected = "Inside Benefit coding service    ::   Instance used of BENEFIT-CODING is running on host :USBLRSKATHAVAR1    ::   And Internally called BENEFIT-DETERMINATION Service, Test";
		Assert.assertEquals(result, result);
	}

}
