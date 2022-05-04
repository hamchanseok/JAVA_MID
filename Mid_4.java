package week10;


public class Mid_4 extends Mid_3 {

	public Mid_4(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int seekSong(String title) {
		for(int i=0; i<song.length; i++) {
			if(song[i].getTitle().equals(title))
			return i;
		}
		return -1;
		
	}

	@Override
	public int seekSong(String title, String artist) {
		int index = seekSong(title);
		if (index < 0)
			return -1;
		if(song[index].getArtist().equals(artist))
			return index;
		return -1;
		
	}
	
	

}
