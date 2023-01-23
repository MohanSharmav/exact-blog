package com.example.BlogEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Blogs")
public class BlogPojo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Title;
	
	@Column(name = "TextBody")
	private String TextBody; 
	
	@Column(name = "Catergory")
	private String Catergory;
	
public BlogPojo()
{
	
}

public BlogPojo(String Title,String TextBody,String Catergory)
{
super();
this.Title=Title;
this.Catergory=Catergory;
this.TextBody=TextBody;
}


	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getTextBody() {
		return TextBody;
	}

	public void setTextBody(String textBody) {
		TextBody = textBody;
	}

	public String getCatergory() {
		return Catergory;
	}

	public void setCatergory(String catergory) {
		Catergory = catergory;
	}

	@Override
	public String toString() {
		return "BlogPojo [Title=" + Title + ", TextBody=" + TextBody + ", Catergory=" + Catergory + "]";
	}
	
}
