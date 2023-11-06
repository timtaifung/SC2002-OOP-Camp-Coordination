package QnA;

public class Submission implements SubmissionAbstract{
	private String content;
	
	public Submission() {this.content = null;}
	public Submission(String c) {this.content = c;}
	
	public void setContent(String newContent) {
		this.content = newContent;
	}

	public void view() {
		System.out.println(this.content);	
		
	}
	public void edit(String y) {
		setContent(y);
	} 
	
}