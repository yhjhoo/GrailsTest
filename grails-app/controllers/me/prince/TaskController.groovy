package me.prince

class TaskController {
	static scaffold = Task
	
	def index = {
		def tasks = Task.findAllByStatus("Open", [sort: "deadline", order:"asc"])
		def tags = Tag.list(sort: "name", order: "acs")
		
		return [openTasks: tasks, allTags: tags] 
	}
}
