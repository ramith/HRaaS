job("Build and push Docker") {
    docker {
        build {
            context = "docker"
            file = "./Dockerfile"
            labels["vendor"] = "mycompany"
           // args["HTTP_PROXY"] = "http://10.20.30.1:123"
        }

        push("ramith.registry.jetbrains.space/p/mp/mydocker/myimage") {
            tags("version1.0")
        }
    }
}