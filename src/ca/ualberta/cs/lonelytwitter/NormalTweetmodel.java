package ca.ualberta.cs.lonelytwitter;


public class NormalTweetmodel extends LonelyTweetModel {

	public NormalTweetmodel(String text) {
		super(text);
		
	}

	@Override
	public void setText(String text) {
		
	}
	
	@Override
	public void setImportant(boolean important) throws Exception {
		if(important){
			throw new IllegalArgumentException();
		}
		this.important = important;
	}
	

}
