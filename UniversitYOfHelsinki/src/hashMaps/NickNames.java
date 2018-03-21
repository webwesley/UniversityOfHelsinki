package hashMaps;

import java.util.HashMap;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class NickNames {

	public static void main(String[] args) {
		HashMap<String, String> nicknames = new HashMap<String, String>();
		nicknames.put("matti", "mage");
		nicknames.put("mikael", "mixu");
		nicknames.put("arto", "arrapa");
		System.out.println(nicknames.get("matti"));
		System.out.println(nicknames.get("mikael"));
	}
}