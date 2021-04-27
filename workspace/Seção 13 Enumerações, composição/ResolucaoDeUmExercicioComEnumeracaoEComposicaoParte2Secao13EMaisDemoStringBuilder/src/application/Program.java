package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date moment = null;
		String title = null;
		String content = null;
		Integer likes = null;
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow, that's awesome");
		
		moment = sdf.parse("21/06/2018 13:05:44");
		title = "Travelling to New Zealand";
		content = "I'm going to visit this wonderful country!";
		likes = 12;
		Post p1 = new Post(moment, title, content, likes);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the force be with you");
		
		moment = sdf.parse("28/07/2018 23:14:19");
		title = "Good night guys";
		content = "See you tomorrow";
		likes = 5;
		Post p2 = new Post(moment, title, content, likes);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
		
	}

}
