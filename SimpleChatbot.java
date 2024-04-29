package com.task2;

import java.util.*;
public class SimpleChatbot {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Hello! I'm your chatbot. What's your name?");
	        String name = scanner.nextLine();
	        System.out.println("Nice to meet you, " + name + "! How can I help you today?");

	        // Start the conversation loop
	        while (true) {
	            String userInput = scanner.nextLine().toLowerCase(); // Convert input to lowercase for easier comparison

	            // Respond based on user input
	            String response = getResponse(userInput);
	            System.out.println(response);

	            // Exit if user says "bye" or "exit"
	            if (userInput.equals("bye") || userInput.equals("exit")) {
	                System.out.println("Goodbye, " + name + "! Have a great day!");
	                break;
	            }
	        }

	        scanner.close();
	    }

	    // Method to generate bot responses
	    public static String getResponse(String userInput) {
	        String response;
	        switch (userInput) {
	            case "hi":
	            case "hello":
	                response = "Hi there!";
	                break;
	            case "how are you":
	                response = "I'm just a bot, but I'm doing well. Thanks for asking!";
	                break;
	            case "what is your name":
	            case "what's your name":
	            
	                response = "I'm just a simple chatbot.";
	                break;
	            case "thank you!":
	            	response=" You're welcome!";
	            	break;
	            case "tell me a joke":
	            	response="Why don't scientists trust atoms? Because they make up everything!";
	            	break;
	            case "how's the weather today":
	            	response="I'm sorry, I can't provide real-time information like that.";
	            	break;
	            case "what is your favorite movie":
	            	response="I'm just a bot, I don't watch movies. But I've heard good things about The Matrix.";
	            	break;
	            case "tell me some pickup lines":
	            	response="Are you a magician? Because whenever I look at you, everyone else disappears."+"\nDo you have a name, or can I call you mine?"+"\nDo you have a Band-Aid? Because I just scraped my knee falling for you.";
	            	break;
	            case "i love you":
	            	response="Aw, that's sweet! But I'm just a chatbot.";
	            	break;
	            case "lets be friends":
	            	response="Sure! I'm always here to chat.";
	            	break;
	            case "bye":
	            case "exit":
	            	response="";
	            	break;
	            default:
	                response = "Sorry, I don't understand that. Can you ask something else?";
	        }
	        return response;
	    
	}


}
