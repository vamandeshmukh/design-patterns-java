package design.patterns.structural.adapter;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;

	@Override
	public void play(String typeOfAudio, String fileName) {

		if (typeOfAudio.equalsIgnoreCase("mp3")) {
			System.out.println("Mp3 being played...");
		} else {
			mediaAdapter = new MediaAdapter(typeOfAudio);
			mediaAdapter.play(typeOfAudio, fileName);
		}

	}

}
