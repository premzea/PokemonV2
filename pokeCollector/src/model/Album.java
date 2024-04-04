package model;

public class Album {
	
	private String regionName;
	private int numPokemons;
	
	//Relations with multiple cardinality
	private Pokemon[] pokemons;
	
	
	
	
	public Album(String regionName, int numPokemons) {
		
		this.regionName = regionName;
		this.numPokemons = numPokemons;
		
		// initializing the array for Pokemon objects
		pokemons = new Pokemon[numPokemons];
		
	}

	public String showPokemons(){
		String out="";
		int count=0;

		for(int i =0; i< numPokemons; i++){

			if (pokemons[i]!=null){
				out += pokemons[i].toString(); 
			}else{
				count++;
			}
		}
		if(count==numPokemons){
			out= "\nThere is no pokemons in the album yet\n";
		}

		return out;
	}




	/**
	 * 
	 * @param name
	 * @param Spec
	 * @param defense
	 * @param attack
	 * @param powe
	 * @param health
	 * @param type
	 */
	public void addPokemon(String name, String spec, int defense, 
			int attack, int powe, int health, Type type) {

		boolean empty= false;
		int pos;
		for( pos= 0; pos < pokemons.length  && !empty; pos++){
			if(pokemons[pos]==null){
				empty=true;
			}
		}

		pokemons[pos]= new Pokemon(name, spec, defense, attack, powe, health, type);
		
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public String deletePokemon(String name) {
		String answer="";

		
		
		return answer;
		
	}



	/**
	* @param name, nombre del pokemon que quiero buscar
	* @return pos, posición del pokemon en el arreglo si lo encuentra, 
	*         -1 si no lo encuentra
	*/
	public int findPokemon(String name){ 
		int pos= -1;

		boolean find= false;
	
		for( pos= 0; pos < pokemons.length  && !find; pos++){
			if(pokemons[pos]!=null && 
				pokemons[pos].getName().equalsIgnoreCase(name)){
				find=true;
			}
		}

		return pos;
	}
	
	
	public String toString() {
		String album="";
		
		album += "Name of the region: " + regionName + "\n";
		album += "contains "+ numPokemons + " cards\n";
		album += "List of Pokemon cards in the album \n" + showPokemons();
		
		return album;
	}

	
	/*
	 * ================================= Getters & Setters
	 */
	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public int getNumPokemons() {
		return numPokemons;
	}

	public void setNumPokemons(int numPokemons) {
		this.numPokemons = numPokemons;
	}

	//private Pokemon[] pokemons;


	




}
