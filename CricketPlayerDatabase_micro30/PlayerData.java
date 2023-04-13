class PlayerData
  {
    String team_name;
    String player_name;
    int jersy_no;
    int noof_matches;
    int noof_runs;
    int noof_wins;

    public PlayerData(String tn,String pn, int jn , int nm , int nr , int nw){
      team_name = tn;
      player_name = pn;
      jersy_no = jn;
      noof_matches = nm;
      noof_runs = nr;
      noof_wins = nw;
    }

	public String getTeam_name() {
		return team_name;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public int getJersy_no() {
		return jersy_no;
	}

	public int getNoof_matches() {
		return noof_matches;
	}

	public int getNoof_runs() {
		return noof_runs;
	}

	public int getNoof_wins() {
		return noof_wins;
	}

  public String toString() {
    return team_name + " " + player_name + " " + jersy_no + " " + noof_matches + " " + noof_runs + " " + noof_wins;
  }

    
  }