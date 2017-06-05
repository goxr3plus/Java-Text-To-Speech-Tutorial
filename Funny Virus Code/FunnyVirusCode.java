package application;

import java.util.Arrays;
import java.util.List;

import marytts.signalproc.effects.JetPilotEffect;
import marytts.signalproc.effects.LpcWhisperiserEffect;
import marytts.signalproc.effects.RobotiserEffect;
import marytts.signalproc.effects.StadiumEffect;
import marytts.signalproc.effects.VocalTractLinearScalerEffect;
import marytts.signalproc.effects.VolumeEffect;

public class FunnyVirusCode {
	
	/**
	 * The main method from which our application is starting
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Create TextToSpeech
		TextToSpeech tts = new TextToSpeech();
		
		//=========================================================================
		//======================= Print available AUDIO EFFECTS ====================
		//=========================================================================
		
		//Print all the available audio effects
		tts.getAudioEffects().stream().forEach(audioEffect -> {
			System.out.println("-----Name-----");
			System.out.println(audioEffect.getName());
			System.out.println("-----Examples-----");
			System.out.println(audioEffect.getExampleParameters());
			System.out.println("-----Help Text------");
			System.out.println(audioEffect.getHelpText() + "\n\n");
			
		});
		
		//=========================================================================
		//========================= Print available voices =========================
		//=========================================================================
		
		//Print all the available voices
		tts.getAvailableVoices().stream().forEach(voice -> System.out.println("Voice: " + voice));
		
		// Setting the Current Voice
		tts.setVoice("cmu-rms-hsmm");
		
		//=========================================================================
		//========================= Let's try different effects=====================
		//=========================================================================
		
		//----- Hey you !-> check the help that is being printed on the console
		//----- You will understand how to use the effects better :)
		
		//VocalTractLinearScalerEffect
		VocalTractLinearScalerEffect vocalTractLSE = new VocalTractLinearScalerEffect(); //russian drunk effect
		vocalTractLSE.setParams("amount:25");
		
		//JetPilotEffect
		JetPilotEffect jetPilotEffect = new JetPilotEffect(); //epic fun!!!
		jetPilotEffect.setParams("amount:0");
		
		//RobotiserEffect
		RobotiserEffect robotiserEffect = new RobotiserEffect();
		robotiserEffect.setParams("amount:0");
		
		//StadiumEffect
		StadiumEffect stadiumEffect = new StadiumEffect();
		stadiumEffect.setParams("amount:150");
		
		//LpcWhisperiserEffect
		LpcWhisperiserEffect lpcWhisperiserEffect = new LpcWhisperiserEffect(); //creepy
		lpcWhisperiserEffect.setParams("amount:100");
		
		//VolumeEffect
		VolumeEffect volumeEffect = new VolumeEffect(); //be careful with this i almost got heart attack
		volumeEffect.setParams("amount:0");
		
		//=========================================================================
		//===================== Now let's troll user ==============================
		//=========================================================================	
		List<String> arrayList0 = Arrays.asList("Hello everyone i am Mary");
		List<String> arrayList1 = Arrays.asList("Mary is gay");
		List<String> arrayList2 = Arrays.asList("What you said to me? ");
		List<String> arrayList3 = Arrays.asList("If you want me to stop say that you are gay , now");
		List<String> arrayList4 = Arrays.asList("I am not gay motherfucker");
		
		//Loop infinitely
		for (int i = 1; i < 150.000; i++) {
			
			tts.setVoice("dfki-poppy-hsmm");
			tts.getMarytts().setAudioEffects(robotiserEffect.getFullEffectAsString());// + "+" + stadiumEffect.getFullEffectAsString());
			arrayList0.forEach(word -> tts.speak(word, 2.0f, false, true));
			
			tts.setVoice("cmu-rms-hsmm");
			tts.getMarytts().setAudioEffects(jetPilotEffect.getFullEffectAsString());// + "+" + stadiumEffect.getFullEffectAsString());
			arrayList1.forEach(word -> tts.speak(word, 2.0f, false, true));
			
			tts.setVoice("dfki-poppy-hsmm");
			tts.getMarytts().setAudioEffects(robotiserEffect.getFullEffectAsString());// + "+" + stadiumEffect.getFullEffectAsString());
			arrayList2.forEach(word -> tts.speak(word, 2.0f, false, true));
			
			tts.setVoice("cmu-rms-hsmm");
			tts.getMarytts().setAudioEffects(lpcWhisperiserEffect.getFullEffectAsString());// + "+" + stadiumEffect.getFullEffectAsString());
			arrayList3.forEach(word -> tts.speak(word, 2.0f, false, true));
			
			tts.setVoice("dfki-poppy-hsmm");
			tts.getMarytts().setAudioEffects(stadiumEffect.getFullEffectAsString());// + "+" + stadiumEffect.getFullEffectAsString());			
			arrayList4.forEach(word -> tts.speak(word, 2.0f, false, true));
			
		}
		
	}
}
