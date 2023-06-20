package design.patterns.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playAudio(String fileName) {
		System.out.println("Playing vlc audio " + fileName);

	}

}
