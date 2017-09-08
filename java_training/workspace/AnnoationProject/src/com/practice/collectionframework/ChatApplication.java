package com.practice.collectionframework;

import java.util.*;

public class ChatApplication {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char ch='N';
		
		do
		{
			System.out.println("\nChatroom options:\n");
			System.out.println("1) Create a chatroom");
			System.out.println("2) Add the user");
			System.out.println("3) User login");
			System.out.println("4) Send a message");
			System.out.println("5) Display the messages from a specific chatroom");
			System.out.println("6) List down all users belonging to the specified chat room");
			System.out.println("7) Logout");
			System.out.println("8) Delete an user");
			System.out.println("9) Delete the chat room");
			
		
		
		int choice =  scan.nextInt(); 
		
		switch (choice)
        {
        case 1 : 
            System.out.println("Enter chatroom name:");
            String cname=scan.next();
            new ChatRoom(cname);
           
            
            break; 
            
        case 2 : 
        	
            System.out.println("Enter user name:");
            String uname=scan.next();
            System.out.println("Enter password:");
            String password=scan.next();
            System.out.println("Enter the chatroom in which you want to join:");
            String usercname=scan.next();
            boolean p=ChatRoom.checkchatroom(usercname);
            if(p)
            	ChatRoom.addUser(uname, password);
            else
            	System.out.println(usercname + " doesn't exist!");
            break; 
            
        case 3 :
        	
        	System.out.println("Enter your user name:");
            String cuname=scan.next();
            System.out.println("Enter your password:");
            String cpassword=scan.next();
            
            boolean c=ChatRoom.checkCredentials(cuname, cpassword);
            if(c)
            	System.out.println("Sucessful login!!");
            else
            	System.out.println("Wrong Credentials!!");
        	break;
        	
        case 4 :
        	
        	System.out.println("Enter the chatroom in which you want to join:");
            String musercname=scan.next();
            boolean mp=ChatRoom.checkchatroom(musercname);
            if(mp)
            {
            	System.out.println("Enter your user name:");
            String mcuname=scan.next();
            System.out.println("Enter your password:");
            String mcpassword=scan.next();
            
            boolean mc=ChatRoom.checkCredentials(mcuname, mcpassword);
            if(mc)
            {
            	System.out.println("Sucessful login!!");
            	System.out.println("Enter your message: ");
            	String msg=scan.next();		
            	new ChatRoom().addMessage(msg);
            }
            else
            	System.out.println("Wrong Credentials!!");
            }	
            else
            	System.out.println(musercname + " doesn't exist!");
            
            break;
            
        case 5:
        	
        	System.out.println("Enter the chatroom from which you want the messages:");
            String cusercname=scan.next();
            boolean cp=ChatRoom.checkchatroom(cusercname);
            if(cp)
            	new ChatRoom().showMessage();
            else
            	System.out.println(cusercname + " doesn't exist!");
        	
        break;
        
        case 6:
        	
        	System.out.println("Enter the chatroom from which you want the users:");
            String uusercname=scan.next();
            boolean up=ChatRoom.checkchatroom(uusercname);
            if(up)
            	new ChatRoom().showUsers();
            else
            	System.out.println(uusercname + " doesn't exist!");
        	
        break;
        
        case 7:
        	
        	System.out.println("You are logged out!");
        	
        break;
        
        case 8:
        	
        	System.out.println("Enter the chatroom from which you want to delete the user:");
            String dusercname=scan.next();
            boolean dp=ChatRoom.checkchatroom(dusercname);
            if(dp)
            {
            	System.out.println("Enter your user name:");
            String dcuname=scan.next();
            System.out.println("Enter your password:");
            String dcpassword=scan.next();
            
            boolean mc=ChatRoom.checkCredentials(dcuname, dcpassword);
            if(mc)
            {
            	new ChatRoom().deleteUser(dcuname);
            	
            }
            else
            	System.out.println("Wrong Credentials!!");
            }	
            else
            	System.out.println(dusercname + " doesn't exist!");
        	
        break;
        
        case 9:
        	
        	System.out.println("Enter the chatroom which you want to delete:");
            String crname=scan.next();
            boolean ccp=ChatRoom.checkchatroom(crname);
            if(ccp)
            {
            	
            	new ChatRoom().deleteChatRoom(crname);
            	
            }
            else
            	System.out.println(crname + " doesn't exist!");
        	
        break;
            
        default : 
            System.out.println("Wrong Entry \n ");
            break;
        }
		
		System.out.println("\nDo you want to continue (Type y or n) \n");
        ch = scan.next().charAt(0); 
		
		}while(ch == 'Y'|| ch == 'y');
	}

}
