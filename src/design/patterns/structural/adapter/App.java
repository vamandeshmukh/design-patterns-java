package design.patterns.structural.adapter;

/**
 * Structural design patterns - Adapter design pattern - Adapter pattern works
 * as a bridge between two incompatible interfaces. This type of design pattern
 * comes under structural pattern as this pattern combines the capability of two
 * independent interfaces. This pattern involves a single class which is
 * responsible to join functionalities of independent or incompatible
 * interfaces. A real life example could be a case of card reader which acts as
 * an adapter between memory card and a laptop. You plugins the memory card into
 * card reader and card reader into the laptop so that memory card can be read
 * via laptop. We are demonstrating use of Adapter pattern via following example
 * in which an audio player device can play mp3 files only and wants to use an
 * advanced audio player capable of playing vlc and mp4 files.
 * 
 * Implementation - We've an interface MediaPlayer interface and a concrete
 * class AudioPlayer implementing theMediaPlayer interface. AudioPlayer can play
 * mp3 format audio files by default. We're having another interface
 * AdvancedMediaPlayer and concrete classes implementing theAdvancedMediaPlayer
 * interface.These classes can play vlc and mp4 format files. We want to make
 * AudioPlayer to play other formats as well. To attain this, we've created an
 * adapter class MediaAdapter which implements the MediaPlayer interface and
 * uses AdvancedMediaPlayerobjects to play the required format. AudioPlayer uses
 * the adapter class MediaAdapter passing it the desired audio type without
 * knowing the actual class which can play the desired format.
 * AdapterPatternDemo, our demo class will useAudioPlayer class to play various
 * formats.
 *
 */

public class App {

	public static void main(String[] args) {

	}

}
