package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entitles.Gamer;

public class GamerManager implements GamerService {
		private GamerCheckService gamerCheckService;
			

		public GamerManager(GamerCheckService gamerCheckService) {
			
			this.gamerCheckService = gamerCheckService;
		}
		
		

		@Override
		public void register(Gamer gamer) {
			if(gamerCheckService.ifCheckRealPerson(gamer)) {
				System.out.println(gamer.getFirstName() + " "+ gamer.getLastName() + " isimli kullan�c� ba�ar�yla kayd edilmi�dir!");
			}else {
				System.out.println("Girilen bilgiler ge�ersizdir, L�tfen yeniden deneyin");
			}
			
		}


		@Override
		public void update(Gamer gamer) {
			System.out.println(gamer.getFirstName() + " "+ gamer.getLastName() + " isimli kullan�c�n�n bilgileri ba�ar�yla yenilenmi�dir!");
			
		}

		@Override
		public void delete(Gamer gamer) {
			System.out.println(gamer.getFirstName() + " "+ gamer.getLastName() + " isimli kullan�c� ba�ar�yla sistemden silinmi�dir!");
			
		}











}
