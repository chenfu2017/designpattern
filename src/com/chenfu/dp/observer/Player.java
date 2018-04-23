package com.chenfu.dp.observer;

import java.util.LinkedList;
import java.util.List;

public abstract class Player {
    private String name;

    private List<Player> players =new LinkedList<Player>();

    public Player addFriend(Player player){
        players.add(player);
        return this;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void help(){
        System.out.println(name+": already on the way!");
    }

    public void attacked(){
        for (Player p:players) {
            if(this.name==p.getName()){
                continue;
            }
            p.help();
        }
    }
}
