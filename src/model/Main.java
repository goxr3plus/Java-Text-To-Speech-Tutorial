package model;

import marytts.modules.synthesis.Voice;

public class Main {

	/**The main method from which our application is starting
	 * @param args
	 */
	public static void main(String[] args) {		
		TextToSpeech tts = new TextToSpeech();
		
//		Voice.getAvailableVoices().stream().forEach(System.out::println);
				
//		tts.speak("In this tutorial i will show you how to make a text to speech program!", 2.0f, false, true);	
		
//		tts.speak("By the way i am Mary", 2.0f, false, true);
		
//		tts.speak("Let's start!", 2.0f, false, false);
		
		
//-------------- That will print all the available voices
				// that we have added on the class path
				Voice.getAvailableVoices().stream().forEach(System.out::println);

				// Setting the Voice
				tts.setVoice("dfki-poppy-hsmm");

				// TTS say something that we actually are typing into the first variable
				tts.speak("Hello World!", 2.0f, false, true);

				// Change the voice
				tts.setVoice("cmu-slt-hsmm");

				// TTS say something
				tts.speak("I see you later ", 1.5f, false, false);
		
	}

}
