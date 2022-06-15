class Match{
    Team home;
    Team away;
    boolean played = false;
    int goalsHome = 0;
    int goalsAway = 0;

    Match(Team h, Team a){
        home = h;
        away = a;
    }
    public String toString(){
        return home+":"+away+"     "+goalsHome+":"+goalsAway;
    }

    Team winner(){
        return (!played || goalsHome==goalsAway)
                ? null
                : (goalsHome>goalsAway ? home : away);
    }

}