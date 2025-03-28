rootProject.name = "new-tube"
include("new-tune-project")
include("new-tune-project:new-tube-auth")
findProject(":new-tune-project:new-tube-auth")?.name = "new-tube-auth"
