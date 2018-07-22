package JavaBasics;

public class Animal {
	String m_name;
	String m_Species;
	int m_height;
	int m_weight;
	String m_isFly;
	String m_type;

	public Animal(String name, String species, int height, int weight, String isfly, String type) {
		this.m_name = name;
		this.m_Species = species;
		this.m_height = height;
		this.m_weight = weight;
		this.m_isFly = isfly;
		this.m_type = type;
	}
   
//	public void getM_name(String M_name) {
//		this.m_name=M_name;
//	}
	
	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_Species() {
		return m_Species;
	}

	public void setM_Species(String m_Species) {
		this.m_Species = m_Species;
	}

	public int getM_height() {
		return m_height;
	}

	public void setM_height(int m_height) {
		this.m_height = m_height;
	}

	public int getM_weight() {
		return m_weight;
	}

	public void setM_weight(int m_weight) {
		this.m_weight = m_weight;
	}

	public String getM_isFly() {
		return m_isFly;
	}

	public void setM_isFly(String m_isFly) {
		this.m_isFly = m_isFly;
	}

	public String getM_type() {
		return m_type;
	}

	public void setM_type(String m_type) {
		this.m_type = m_type;
	}

	public String toStr() {
		return "name: " + m_name + ", species: " + m_Species + ", height: " + m_height + ", weight: " + m_weight + ", fly: " + m_isFly + ", type :"+ m_type;
		
	}
}


