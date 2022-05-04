package week10;

import java.util.Scanner;

public abstract class Mid_3 implements Mid_1 {

	protected Mid_2 song[];
	
	public Mid_3(int num) {
		this.song = new Mid_2[num];
	}

	@Override
	public void inputSong() {
		String title, artist, country;
		int year;
		Scanner s = new Scanner(System.in);
		
		
		for(int i=0; i<song.length; i++) {
			System.out.print("[" + (i+1) + "]��° title :");
			title=s.next();
			System.out.print("[" + (i+1) + "]��° artist :");
			artist=s.next();
			System.out.print("[" + (i+1) + "]��° year :");
			year=s.nextInt();
			System.out.print("[" + (i+1) + "]��° country :");
			country=s.next();
			song[i] = new Mid_2 (title , artist, country, year);
		}
		
	}

	@Override
	public void showSong(int index) {
		if( index < 0) {
			System.out.println("Ž���� ���� �����ϴ�.!!!");
			return;
		}
		System.out.println("===== Ž���� Song ���� ======");
		System.out.println("title : " + song[index].getTitle());
		System.out.println("title : " + song[index].getArtist());
		System.out.println("title : " + song[index].getYear());
		System.out.println("title : " + song[index].getCountry());
		
		
	}
	abstract public int seekSong(String title);
	abstract public int seekSong(String title, String artist);

	
}
