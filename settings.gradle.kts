rootProject.name = "new-tube"
include("new-tube-project")
include("new-tube-project:new-tube-auth")
findProject(":new-tube-project:new-tube-auth")?.name = "new-tube-auth"
include("new-tube-project:new-tube-common")
findProject(":new-tube-project:new-tube-common")?.name = "new-tube-common"
