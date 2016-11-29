package model;

import marytts.modules.synthesis.Voice;

public class Main {

	/**
	 * The main method from which our application is starting
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TextToSpeech tts = new TextToSpeech();

		// -------------- That will print all the available voices
		// that we have added on the class path
		Voice.getAvailableVoices().stream().forEach(voice -> System.out.println("Voice: " + voice));

		// Setting the Voice
		tts.setVoice("cmu-slt-hsmm");

		// TTS say something that we actually are typing into the first variable
		tts.speak("Today we will learn how to add different languages and voices on Mary T T S!", 2.0f, false, true);

		// Setting the Voice
		tts.setVoice("dfki-poppy-hsmm");

		// TTS say something that we actually are typing into the first variable
		tts.speak("Who is Mary Bob?", 2.0f, false, true);

		// Setting the Voice
		tts.setVoice("cmu-rms-hsmm");

		// TTS say something that we actually are typing into the first variable
		tts.speak("No one my darling...", 2.0f, false, true);

		// Setting the Voice
		tts.setVoice("dfki-poppy-hsmm");

		// TTS say something that we actually are typing into the first variable
		tts.speak("I don't trust you", 2.0f, false, true);

		// Setting the Voice
		tts.setVoice("cmu-rms-hsmm");

		// TTS say something that we actually are typing into the first variable
		tts.speak("Oh yeah baby!", 2.0f, false, true);

		// Setting the Voice
		tts.setVoice("dfki-poppy-hsmm");

		// TTS say something that we actually are typing into the first variable
		tts.speak("aaaaaa", 2.0f, false, true);

		// Setting the Voice
		tts.setVoice("cmu-rms-hsmm");

		// TTS say something that we actually are typing into the first variable
		tts.speak("yeah!", 2.0f, false, true);

		// Setting the Voice
		tts.setVoice("dfki-poppy-hsmm");

		// TTS say something that we actually are typing into the first variable
		tts.speak("oh oh yeah!", 2.0f, false, true);

		// Setting the Voice
		tts.setVoice("dfki-poppy-hsmm");

		// TTS say something that we actually are typing into the first variable
		tts.speak("I am Elize , a wonderful girl!", 2.0f, false, true);

		// Setting the Voice
		tts.setVoice("cmu-rms-hsmm");

		// TTS say something that we actually are typing into the first variable
		tts.speak("Shut up Elize . Let's continue our tutorials!", 2.0f, false, true);

	}

}
