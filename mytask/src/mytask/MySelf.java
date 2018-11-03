/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytask;


/**
 *
 * @author Trevor Chirango
 */
public class MySelf {
        private int age;
	private String firstname;
	private String surname;
	private String goal;
        private String gender;
        private String attributes;
        private String address;
        private String hobbies;
	
	
	
	public MySelf() {
		age = 21 ;
		firstname = "Trevor";
		goal = "To further develop myself in Software Development and give solutions to IT related problems.";
		surname = "Chirango";		
		gender = "male";
                address="\n 12686\n Johannesburg \n Norton";
                hobbies="music,driving,gaming,watchingTv";
                attributes = "Ability to learn and adapt quickly to new IT environment and also can work effectively under minimum supervision ";
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		
		return this.age;

	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		
		return this.firstname;
	}
	/**
	 * @return the goal
	 */
	public String getGoal() {
		
		return this.goal;
	}
	/**
	 * @param surname the surname to set
	 */
	public String getSurname() {
		
		return this.surname;
	}
	
        public String getHobbies() {
		
		return this.hobbies;
	}
        
        public String getAddress() {
		
		return this.address;
	}
        
        public String getGender() {
		
		return this.gender;
	}
        public String getAttributes() {
		
		return this.attributes;
	}
        
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MySelf :\n age= " + age + "\n firstname= " + firstname + "\n surname = " + surname + "\n gender = " + gender + "\n attributes = "+ attributes+"\n goal = " + goal + "\n\n address : "+address+"";
	}
	}

