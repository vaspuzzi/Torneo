import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class ConcreteFactoryPartecipanti implements AbsFactoryPartecipanti {

	@Override
	public Partecipante creaPartecipanteRandom() {
		
		String[] squadra= new String[5];
		squadra[0]="A";
		squadra[1]="B";
		squadra[2]="C";
		squadra[3]="D";
		squadra[4]="E";
		
		final Random random = new Random();
		
		Partecipante p=new Partecipante();
		
		int nameLength = 3 + random.nextInt(5);
		int surnameLength = 5 + random.nextInt(8);
		
		
		String name = RandomStringUtils.randomAlphabetic(nameLength);
		name = StringUtils.capitalize(name.toLowerCase());
		
		String surname = RandomStringUtils.randomAlphabetic(surnameLength);
		surname = StringUtils.capitalize(surname.toLowerCase());
		
		p.setCognome(surname);
		p.setNome(name);

		p.setSquadra(squadra[random.nextInt(5)]);
		
		return p;
	}

	@Override
	public Partecipante creaPartecipante() {
		Partecipante p = new Partecipante();
		Scanner in = new Scanner(System.in);
		System.out.print("Nome: ");
		p.setNome(in.nextLine());
		System.out.print("\nCognome: ");
		p.setCognome(in.nextLine());
		System.out.print("\nSquadra: ");
		p.setSquadra(in.nextLine());
		
		return p;
	}
	



}
