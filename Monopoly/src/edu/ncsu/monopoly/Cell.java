package edu.ncsu.monopoly;

public abstract class Cell implements Monopolyinterfacee {
	private String name;
	protected Player theOwner;
	private boolean available = true;
	public String getName() {
		return name;
	}

	public Player getTheOwner() {
		return theOwner;
	}
	
	public int getPrice() {
		return 0;
	}


	
	public abstract void playAction();
	
	void setName(String name) {
		this.name =name;
		
	}
	
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    public String toString() {
        return name;
    }

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}
