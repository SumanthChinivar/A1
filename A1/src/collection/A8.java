package collection;

import java.util.ArrayList;

/*
 * Create an arralist of chats
 */
public class A8 {
public static void main(String[] args) {
	ArrayList chats=new ArrayList();
	chats.add("Bhel puri");
	chats.add("Samosa chat");
	chats.add("Paddi chat");
	chats.add("paav bhaji");
	
	ArrayList chat=new ArrayList();
	chat.add("Bhel puri");
	chat.add("Samosa chat");
	chat.add("Paddi chat");
	chat.add("paav bhaji");
	
	System.out.println(chats.equals(chats));
}
}
