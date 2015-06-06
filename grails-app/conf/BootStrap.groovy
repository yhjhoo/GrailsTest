import me.prince.*

class BootStrap {

    def init = { servletContext ->
		def workTag = new Tag(name: "Work").save(failOnError: true)
		def homeTag = new Tag(name: "Home").save(failOnError: true)
		
		def task = new Task(
				summary: "Do 2nd intro screencast",
				details: "Create the second intro screencast for Grails",
				status: "Open",
				deadline: new Date())
		task.addToTags(workTag)
		task.addToTags(homeTag)
		task.save(failOnError: true)
    }
    def destroy = {
    }
}
