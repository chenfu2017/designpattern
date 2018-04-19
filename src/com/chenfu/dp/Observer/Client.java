package com.chenfu.dp.Observer;

public class Client {
    public static void main(String[] args) {
        CurrentPlayer tom = new CurrentPlayer("monkey");
        Teammate timo = new Teammate("timo");
        Teammate dogbear = new Teammate("dogbear");
        Teammate doghead = new Teammate("doghead");
        Teammate bigworm = new Teammate("bigworm");
        tom.addFriend(timo).addFriend(dogbear).addFriend(doghead).addFriend(bigworm);
        tom.attacked();
    }
}
