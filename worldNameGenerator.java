package window;
import java.util.concurrent.ThreadLocalRandom;

public class worldNameGenerator {

	public String gen() {
		
		String finalString;
		int ai;
		int bi;
		int ci;
		
		String[] as =
			{
				 "Deathly",
				 "Blight",
				 "Plagued",
				 "Dark",
				 "Deep",
				 "Light",
				 "Lively",
				 "Bountiful",
				 "Joyous",
				 "Fruitful"
			};
		String[] bs =
			{
				"spikes",
				"town",
				"pit",
				"abyss",
				"swamp",
				"vale",
				"city",
				"forest",
				"retreat",
				"hamlet"
			};
		String[] cs =
			{
					" in the Mortal Plane",
					" in the Abyssal Realm",
					" in the Untamed Worlds",
					" in the Wild Hunt",
					" in the Dark Kingdom",
					" in the Spirit Realm",
					" in the Imp World",
					" in the Immortal Plane",
					" in the Fairycrag",
					" in the Holy Reichpur"
			};
		
		ai = ThreadLocalRandom.current().nextInt(0, 10);
		bi = ThreadLocalRandom.current().nextInt(0, 10);
		ci = ThreadLocalRandom.current().nextInt(0, 10);
		
		finalString = as[ai] + bs[bi] + cs[ci];
		
		return finalString;
		
	}
	
	
}
