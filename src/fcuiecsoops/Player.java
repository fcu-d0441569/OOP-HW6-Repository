package fcuiecsoops;

public class Player {
	 private String playerName;
	 private Pokemon[] pokemons;
	 private int level = 1;

	 public Player(String playerName) {
	  this.playerName = playerName;
	 }

	 public String getplayerName() {
	  return playerName;
	 }

	 public Pokemon[] getpokemons() {
	  return pokemons;
	 }

	 public int getlevel() {
	  return level;
	 }

	 public void setpokemons(Pokemon[] pokemons) {
	  this.pokemons = pokemons;
	 }

	 public void setlevel(int level) {
	  this.level = level;
	 }

	}