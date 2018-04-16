import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
	public static void main(String[] args) {
GetLatestTweet game = new GetLatestTweet();
game.MakeButtons();
	}
	JButton search;
	JLabel label;
	JTextField text;
	JFrame window;
public void MakeButtons() {
	search = new JButton();
	search.setText("Search the Twitterverse");
	text = new JTextField(15);
	window = new JFrame();
	window.setSize(800,40);
	window.setVisible(true);
	JPanel panel = new JPanel();
	window.add(panel);
	panel.add(text);
	panel.add(search);
	search.addActionListener(this);
	window.pack();
	label = new JLabel();
	panel.add(label);
}

private String getLatestTweet(String searchingFor) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(
          "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
          "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
          "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

    twitter.setOAuthAccessToken(accessToken);

    Query query = new Query(searchingFor);
    try {
          QueryResult result = twitter.search(query);
          return result.getTweets().get(0).getText();
    } catch (Exception e) {
          System.err.print(e.getMessage());
          return "What the heck is that?";
    }
}
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String texts = text.getText();
	label.setText(getLatestTweet(texts));
	window.pack();
}

}