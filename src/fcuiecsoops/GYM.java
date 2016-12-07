package fcuiecsoops;

import java.util.Random;

public class GYM {

 public static Player fight(Player...players){
  int people = 0,win1 = 0, win2 = 0;
  Player[] play = new Player[2];  
  for(Player plays:players){
   play[people] = plays;
   people++;
  }
  Pokemon[] pkm1 = new Pokemon[3];
  Pokemon[] pkm2 = new Pokemon[3];
  pkm1 = play[0].getpokemons();
  pkm2 = play[1].getpokemons();
  
  for(int i =0;i<3;i++){
   PokemonType type1 = pkm1[i].getType();
   PokemonType type2 = pkm2[i].getType();
    if(type1 == PokemonType.FIRE){
     if(type2 == PokemonType.FIRE){
       if(pkm1[i].getcp() == pkm2[i].getcp()){
        Random num = new Random();
        if(num.nextInt(100)%2==1){
         win1++;
        }
        else{
         win2++;
        }
       }
       else if(pkm1[i].getcp() > pkm2[i].getcp()){
        win1++;
       }
       else if(pkm1[i].getcp() < pkm2[i].getcp()){
        win2++;
       }
     }
     else if(type2 == PokemonType.GRASS){
      win1++;
     }
     else if(type2 == PokemonType.WATER){
      win2++;
     }
    } 
     
     
    else if(type1 == PokemonType.GRASS){
     if(type2 == PokemonType.GRASS){
      if(pkm1[i].getcp() == pkm2[i].getcp()){
       Random num = new Random();
       if(num.nextInt(100)%2==1){
        win1++;
       }
       else{
        win2++;
       }
      }
      else if(pkm1[i].getcp() > pkm2[i].getcp()){
       win1++;
      }
      else if(pkm1[i].getcp() < pkm2[i].getcp()){
       win2++;
      }
      
     }
     else if(type2 == PokemonType.WATER){
      win1++;
     }
     else if(type2 == PokemonType.FIRE){
      win2++;
     }
    }
    else if(type1 == PokemonType.WATER){
     if(type2 == PokemonType.WATER){
      if(pkm1[i].getcp() == pkm2[i].getcp()){
       Random num = new Random();
       if(num.nextInt(100)%2==1){
        win1++;
       }
       else{
        win2++;
       }
      }
      else if(pkm1[i].getcp() > pkm2[i].getcp()){
       win1++;
      }
      else if(pkm1[i].getcp() < pkm2[i].getcp()){
       win2++;
      }
      
     }
     else if(type2 == PokemonType.FIRE){
      win1++;
     }
     else if(type2 == PokemonType.GRASS){
      win2++;
     }
    }
    if(win1 == 2||win2 == 2){
     break;
    }
  }
  if(win1>win2){
   play[0].setlevel(play[0].getlevel()+1);
   System.out.println("Winner is "+play[0].getplayerName()+",and his/her level becomes"+play[0].getlevel());
   return play[0];
  }
  else{
   play[1].setlevel(play[1].getlevel()+1);
   System.out.println("Winner is "+play[1].getplayerName()+",and his/her level becomes"+play[1].getlevel());
   return play[1];
  }
 }

}