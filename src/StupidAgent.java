
public class StupidAgent extends Agent{

	@Override
	
	public void exploreEnvironment() {
		int totalMoves = 0;
		int nMoves = 0;
		while(Successes <= NUM_GOALS){
			char randChar = (char)('a' + (int)(Math.random() * alphabet.length));
			//System.out.println(randChar);
			boolean[] sensors = env.tick(randChar);
			nMoves++;
			if (sensors[IS_GOAL]){
				System.out.println("goal found in: " + nMoves);
				Successes++;
				totalMoves += nMoves;
				nMoves = 0;
			}
		}
		System.out.println("totalMoves: " + totalMoves);
		System.out.println("averageMoves: " + totalMoves/NUM_GOALS);
	}
	public static void main(String args[]){
		  for(int i = 0; i < NUM_MACHINES; ++i) {
			  System.out.println("new machine");
              StupidAgent stupid = new StupidAgent();
              stupid.exploreEnvironment();
          }
		  
	}

}
