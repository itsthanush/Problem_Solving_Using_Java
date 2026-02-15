import java.util.*;

public class Task1_Student {

	static class Player {
		String name;
		int score;

		Player(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}

	static class Checker implements Comparator<Player> {
		public int compare(Player a, Player b) {
			int scoreCompare = Integer.compare(b.score, a.score);
			if (scoreCompare != 0) return scoreCompare;
			return a.name.compareTo(b.name);
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		if (sc.hasNextInt()) n = sc.nextInt();
		List<Player> players = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (!sc.hasNext()) break;
			String name = sc.next();
			if (!sc.hasNextInt()) break;
			int score = sc.nextInt();
			players.add(new Player(name, score));
		}
		sc.close();

		// Echo original input
		System.out.println(n);
		for (Player p : players) {
			System.out.println(p.name + " " + p.score);
		}

		// Print sorted output
		Collections.sort(players, new Checker());
		for (Player p : players) {
			System.out.println(p.name + " " + p.score);
		}
	}
}
