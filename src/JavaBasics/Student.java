package JavaBasics;

public class Student {
	String m_name;
	String m_sirname;
	int m_roll;
	int m_marks;
	int m_classno;

	// constructer hai jab aap student abc = new student("vikas", "kumar",4,34,8);
	// abc.name
	public Student() {

	}

	public Student(String name, String sirname, int roll, int marks, int classno) {
		m_name = name;
		m_sirname = sirname;
		m_roll = roll;
		m_marks = marks;
		m_classno = classno;

	}
	// public String get_Name() {
	// return this.m_name; // abc.m_name

	// }

	public String toString() {
		return "name: " + m_name + ", sirname: " + m_sirname + ", roll: " + m_roll + ", marks: " + m_marks + ", class: "
				+ m_classno;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_sirname() {
		return m_sirname;
	}

	public void setM_sirname(String m_sirname) {
		this.m_sirname = m_sirname;
	}

	public int getM_roll() {
		return m_roll;
	}

	public void setM_roll(int m_roll) {
		this.m_roll = m_roll;
	}

	public int getM_marks() {
		return m_marks;
	}

	public void setM_marks(int m_marks) {
		this.m_marks = m_marks;
	}

	public int getM_classno() {
		return m_classno;
	}

	public void setM_classno(int m_classno) {
		this.m_classno = m_classno;
	}
}
