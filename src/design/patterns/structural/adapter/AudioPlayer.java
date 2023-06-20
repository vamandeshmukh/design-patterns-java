package design.patterns.structural.adapter;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String typeOfAudio, String fileName) {

		if (typeOfAudio.equalsIgnoreCase("mp3"))
			System.out.println("Mp3 being played...");
		else if (typeOfAudio.equalsIgnoreCase("vlc"))
			System.out.println("VLC being played...");

	}

}
