package media_pack;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

//p.914 - 오류남(왜안되는지??)

public class MediaController implements Initializable {

	@FXML
	ImageView imageView;
	@FXML
	MediaView mediaView;
	@FXML
	Button btnPlay, btnPause, btnStop;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		Media media = new Media(getClass().getResource("audio.wav").toString());
		MediaPlayer player = new MediaPlayer(media);
		mediaView.setMediaPlayer(player);

		player.setOnReady(new Runnable() {

			@Override
			public void run() {
				btnPlay.setDisable(false);
				btnPause.setDisable(true);
				btnStop.setDisable(true);

			}
		});

	}

}
