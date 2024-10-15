import java.util.Scanner;
class SimpleChatbot 
{
    	public static void main(String[] args) 
	{
        	// Scanner object to read user input
        	Scanner scanner = new Scanner(System.in);
        
        	// Starting message
        	System.out.println("Hello! I am your friendly chatbot. Type 'exit' to end the conversation.");
        
        	// Infinite loop to keep the conversation going
        	while (true) 
		{
            		// Asking for user input
            		System.out.print("You: ");
            		String userInput = scanner.nextLine().toLowerCase(); // Convert input to lowercase
            
            		// Exit condition
            		if (userInput.equals("exit")) 
			{
                		System.out.println("Chatbot: Goodbye! Have a great day.");
                		break; 
            		}
            
            		// Chatbot's responses based on keywords
            		String response = getResponse(userInput);
            		System.out.println("Chatbot: " + response);
        	}
        	// Closing the scanner
        	scanner.close();
    	}

    	// Method to generate chatbot's response based on the input
    	public static String getResponse(String userInput) 
	{
        	// Basic responses using keywords
        	if (userInput.contains("hello") || userInput.contains("hi")) 
		{
            		return "Hello! How can I assist you today?";
        	} 
		else if (userInput.contains("how are you")) 
		{
            		return "I'm just a bunch of code, but I'm here to help you!";
        	} 
		else if (userInput.contains("your name")) 
		{
            		return "I'm ChatBot, your virtual assistant.";
        	} 
		else if (userInput.contains("weather")) 
		{
            		return "I don't have access to live data, but it’s always sunny when you're coding!";
        	} 
		else if (userInput.contains("help")) 
		{
            		return "I can assist you with basic questions. Try asking me about Java or say 'exit' to end.";
        	} 
		else 
		{
            		return "Sorry, I don't understand that. Can you ask something else?";
        	}
    	}
}
