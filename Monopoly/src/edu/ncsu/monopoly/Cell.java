package edu.ncsu.monopoly;

public abstract class Cell implements Monopolyinterfacee {
	private boolean available = true;
	private String name;
	protected Player owner;

	public String getName() {
		return name;
	}

	public Player getOwner() {
		return owner;
	}
	
	public int getPrice() {
		return 0;
	}


	
	public abstract void playAction();
	
	void setName(String name) {
		this.name =name;
		
	}
	
	public void setOwner(Player owner) {
		this.owner = owner;
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
