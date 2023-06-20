package design.patterns.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playAudio(String fileName) {
		System.out.println("Playing mp4 audio " + fileName);

		
	}

}
