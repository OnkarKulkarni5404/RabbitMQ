package com.persistent.cafe.queueconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.persistent.cafe.dao.CafeDaoImpl;

@Component
public class QueueConsumer {
 
@Autowired
CafeDaoImpl dao;



 public void receiveMessage(String message) {
  processMessage(message);
 }

public void receiveMessage(byte[] message) {
  String strMessage = new String(message);
  processMessage(strMessage);
 }

private void processMessage(String message) {
  try {
	  System.out.println(message+" at Persistent");
	  
	  
	  
	  if(message.equals("\"Inserted\"")) {
		  dao.IncreaseCount();
	  }
	  if(message.equals("\"Deleted\""))
	  {
		  dao.DecreaseCount();
	  }
	 
	  
  } catch (Exception e) {
  }
 }
}
