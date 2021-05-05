package Concrete;

import Abstract.GameService;
import Entitles.Game;
import Entitles.Gamer;

public class GameManager implements GameService {
	public void get(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "isimli  kullanici " + game.getId()
				+ " idsine sahip " + game.getName() + " isimli oyunu ba�ar�yla sisteme ekledi");
	}

	public void delete(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli kullanici " + game.getId()
				+ " idsine sahip " + game.getName() + " isimli oyunu sistemden ba�ar�yla sildi ");
	}

	public void update(Game game) {
		System.out.println(game.getId() + " idsine sahip " + game.getName() + " isimli oyunu g�ncelledi ");
	}

}
