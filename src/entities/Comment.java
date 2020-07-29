package entities;

public class Comment {

	// Attributes
	private String text;

	// Builders
	public Comment() {
	}

	public Comment(String text) {
		this.text = text;
	}

	// Accessor Methods
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
