package me.prince

class Tag {
	String name
	static hasMany = [tasks : Task]
	static belongsTo = Task
	
    static constraints = {
		name blank:false, unique: true
    }

	@Override
	public String toString() {
		return "haha: " + name ;
	}
	
}
