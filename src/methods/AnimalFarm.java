package methods;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {

		String animal = JOptionPane.showInputDialog("Choose an animal. Cow, duck, dog, cat, or a llama.");
		if (animal.equalsIgnoreCase("llama")) {
			playLlama();
		}
		if (animal.equalsIgnoreCase("duck")) {
			for (int i = 0; i < 100; i++) {
				playQuack();
			}
		}
		if (animal.equalsIgnoreCase("cow")) {
			playMoo();
		}
		if (animal.equalsIgnoreCase("dog")) {
			playWoof();

		}

		if (animal.equalsIgnoreCase("cat")) {
			playMeow();
		}
	}
	/* 2. Make it so that the user can keep entering new animals. */

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(100);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
