package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	// Attributes
	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	// Associations
	private List<Comment> comments = new ArrayList<>();

	// Builders
	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	// Accessor Methods
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	// Methods
	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		String quebraLinha = System.getProperty("line.separator");

		sb.append(title + quebraLinha);
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + quebraLinha);
		sb.append(content + quebraLinha);
		sb.append("Comments: " + quebraLinha);
		for (Comment c : comments) {
			sb.append(c.getText() + quebraLinha);
		}
		return sb.toString();
	}

}
