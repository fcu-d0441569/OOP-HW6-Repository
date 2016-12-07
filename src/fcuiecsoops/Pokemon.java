package fcuiecsoops;

public class Pokemon {
	 private final String name;
	 private int cp;
	 final PokemonType type;

	 public Pokemon(String name, PokemonType type, int cp) {
	  this.name = name;
	  this.type = type;
	  this.cp = cp;
	 }
	 public String getname(){
	  return name;
	 }
	 public PokemonType getType(){
	  return type;
	 }
	 public int getcp(){
	  return cp;
	 }
	 public void setcp(int cp){
	  this.cp = cp ;
	 }
	}