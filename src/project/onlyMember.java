package project;

import java.io.IOException;

public class onlyMember {
	FavoritesSong fs = new FavoritesSong();
	Login lo = new  Login();
	public void membership() throws IOException {
		
		fs.selectFavorite();
	}
	public void newmembership()throws IOException {
		lo.Sign_up();
		fs.selectFavorite();
	}
}
