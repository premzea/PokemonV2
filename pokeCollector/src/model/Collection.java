package model;

public class Collection {
	

	private User principalOwner;
	private User[] users = new User[2];
	
	//Relationships
	
	private Date creationDate;
	private Album album1;
	private Album album2;
	private Album album3;
	
	public Collection(User owner, Date creationDate) {
		this.principalOwner = owner; 
		this.creationDate = creationDate;

		
	}

	public Collection(String nameOwner, String userOwner, int edadOwner, int day, int month, int year) {
		principalOwner = new User(nameOwner, userOwner, edadOwner);
		creationDate = new Date(day, month, year);
		
	}

	
	
	public User[] getUsers(){
		return users;
	}

	public void addUser(String nomCompleto, String nomUsuario, int edad){
		for(int i = 0; i<2; i++){
			if(users[i] == null){
				users[i] = new User(nomCompleto, nomUsuario, edad);
				i = 4;
			}
		}
	}

	public String showUsers(){
		String output = "Usuario Principal\n" + principalOwner.toString();
		for (int i = 0; i< 2; i++){
			if (users[i] != null){
			output = output + "Usuario " + (i+1) + "\n"  + users[i].toString();
			}
		}
		return output;
	}
	
	public String toString() {
		String out="";
		out += "This collection belongs to " + principalOwner;
		out += "\ncreated on " + creationDate.toString();
		return out;
	}

	/**
	@return true si todos los albums son null
	*/
	public boolean isEmpty(){
		return album1 == null && album2 == null && album3==null;
	}

	/** Debe retornar true si hay algún objeto null, false en el caso contrarion
	*/
	public boolean hasAlbums() {
		
		return album1 == null || album2 == null || album3==null;
	}

	public String showAlbums() {
		String answ= "";

		if (album1!=null){
			answ += "==== Album1===\n";
			answ += album1.toString();
		}

		if (album2!=null){
			answ += "==== Album2===\n";
			answ += album2.toString();
		}

		if (album3!=null){
			answ += "==== Album3===\n";
			answ += album3.toString();
		}

		return answ;
	}

		

		
	

	public void addAlbum(String tit, int num) {

		
		if (album1==null){
			album1= new Album(tit, num);
		}else if(album2 ==null){
			album2= new Album(tit, num);
		}else if (album3==null){
			album3 = new Album(tit, num);
		}
	} 

		/*
	 * ============================== Getters & Setters
	 */

	public User getOwner() {
		return principalOwner;
	}

	public void setOwner(User owner) {
		this.principalOwner = owner;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Album getAlbum1() {
		return album1;
	}

	public void setAlbum1(Album album1) {
		this.album1 = album1;
	}

	public Album getAlbum2() {
		return album2;
	}

	public void setAlbum2(Album album2) {
		this.album2 = album2;
	}

	public Album getAlbum3() {
		return album3;
	}

	public void setAlbum3(Album album3) {
		this.album3 = album3;
	}

}
