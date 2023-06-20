package design.patterns.structural.adapter;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;

	// delete afterwards
	public MediaAdapter() {
		super();
	}

	public MediaAdapter(String typeOfAudio, String fileName) {
		if (typeOfAudio.equalsIgnoreCase("vlc"))
			advancedMediaPlayer = new VlcPlayer();
		else if (typeOfAudio.equalsIgnoreCase("vlc"))
			advancedMediaPlayer = new Mp4Player();

	}

	@Override
	public void play(String typeOfAudio, String fileName) {

		if (typeOfAudio.equalsIgnoreCase("vlc"))
			advancedMediaPlayer.playAudio(fileName);
		else if (typeOfAudio.equalsIgnoreCase("mp4"))
			advancedMediaPlayer.playAudio(fileName);

	}

}
