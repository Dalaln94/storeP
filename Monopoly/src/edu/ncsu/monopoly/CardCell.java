package edu.ncsu.monopoly;

public class CardCell extends Cell {
    private int type;
	public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public boolean playAction(String msg) {
		return false;
    }
    
    public int getType() {
        return type;
    }

	@Override
	public Player getTheOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTheOwner(Player owner) {
		// TODO Auto-generated method stub
		
	}
}
